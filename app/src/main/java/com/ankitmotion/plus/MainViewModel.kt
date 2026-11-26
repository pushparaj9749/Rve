package com.ankitmotion.plus

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ankitmotion.core.export.ExportEngine
import com.ankitmotion.core.model.NewProjectRequest
import com.ankitmotion.core.model.OperationProgress
import com.ankitmotion.core.model.ProjectMeta
import com.ankitmotion.core.model.ReverseSettings
import com.ankitmotion.core.model.Scene
import com.ankitmotion.feature.reverse.ReverseProcessor
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = application.appContainer().repository

    val projects = repository.observeProjects()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList<ProjectMeta>())

    private val _editorScene = MutableStateFlow<Scene?>(null)
    val editorScene: StateFlow<Scene?> = _editorScene.asStateFlow()

    private val _reverseState = MutableStateFlow(OperationProgress())
    val reverseState: StateFlow<OperationProgress> = _reverseState.asStateFlow()

    private val _exportState = MutableStateFlow(OperationProgress())
    val exportState: StateFlow<OperationProgress> = _exportState.asStateFlow()

    fun createProject(request: NewProjectRequest) {
        viewModelScope.launch { repository.createProject(request) }
    }

    fun openProject(id: String) {
        viewModelScope.launch { _editorScene.value = repository.getScene(id) }
    }

    fun saveScene(scene: Scene) {
        viewModelScope.launch { repository.saveScene(scene) }
    }

    fun reverseVideo(uri: Uri, settings: ReverseSettings) {
        viewModelScope.launch {
            _reverseState.value = OperationProgress(running = true, message = "Reverse shuru...")
            runCatching {
                val file = ReverseProcessor.reverse(getApplication(), uri, settings) { progress ->
                    _reverseState.value = _reverseState.value.copy(progress = progress)
                }
                _reverseState.value = OperationProgress(
                    progress = 1f,
                    message = "Reverse ready: ${file.name}",
                    outputPath = file.absolutePath
                )
            }.onFailure { error ->
                _reverseState.value = OperationProgress(message = "Reverse fail: ${error.message}")
            }
        }
    }

    fun exportScene(scene: Scene) {
        viewModelScope.launch {
            _exportState.value = OperationProgress(running = true, message = "Export shuru...")
            runCatching {
                val output = ExportEngine.createOutputFile(getApplication())
                val file = ExportEngine.export(getApplication(), scene, output) { progress ->
                    _exportState.value = _exportState.value.copy(progress = progress)
                }
                val galleryUri = ExportEngine.publishToGallery(getApplication(), file)
                _exportState.value = OperationProgress(
                    progress = 1f,
                    message = if (galleryUri != null) "Gallery me save ho gaya" else "Saved: ${file.name}",
                    outputPath = file.absolutePath
                )
            }.onFailure { error ->
                _exportState.value = OperationProgress(message = "Export fail: ${error.message}")
            }
        }
    }

    fun exportProject(scene: Scene, target: Uri) {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                getApplication<Application>().contentResolver.openOutputStream(target)?.use { output ->
                    output.write(Json.encodeToString(scene).toByteArray())
                } ?: error("Cannot open target file")
                withContext(Dispatchers.Main) {
                    _exportState.value = OperationProgress(message = "Project saved (.rve)")
                }
            }.onFailure { error ->
                withContext(Dispatchers.Main) {
                    _exportState.value = OperationProgress(message = "Save fail: ${error.message}")
                }
            }
        }
    }

    fun importProject(source: Uri) {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                val json = getApplication<Application>().contentResolver.openInputStream(source)?.use { input ->
                    input.bufferedReader().readText()
                } ?: error("Cannot read project file")
                val scene = Json { ignoreUnknownKeys = true }.decodeFromString<Scene>(json)
                repository.saveScene(scene)
                withContext(Dispatchers.Main) {
                    _editorScene.value = scene
                    _exportState.value = OperationProgress(message = "Project imported")
                }
            }.onFailure { error ->
                withContext(Dispatchers.Main) {
                    _exportState.value = OperationProgress(message = "Import fail: ${error.message}")
                }
            }
        }
    }
}
