package com.ankitmotion.core.database

import com.ankitmotion.core.model.NewProjectRequest
import com.ankitmotion.core.model.ProjectMeta
import com.ankitmotion.core.model.Scene
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.UUID

class ProjectRepository(private val dao: ProjectDao) {
    private val json = Json { ignoreUnknownKeys = true }

    fun observeProjects(): Flow<List<ProjectMeta>> = dao.observeAll().map { rows ->
        rows.map { row ->
            ProjectMeta(
                id = row.id,
                title = row.title,
                createdAt = row.createdAt,
                modifiedAt = row.modifiedAt,
                width = row.width,
                height = row.height,
                fps = row.fps
            )
        }
    }

    suspend fun getScene(id: String): Scene? =
        dao.getById(id)?.let { json.decodeFromString<Scene>(it.sceneJson) }

    suspend fun createProject(request: NewProjectRequest): ProjectMeta {
        val now = System.currentTimeMillis()
        val id = UUID.randomUUID().toString()
        val scene = Scene(
            id = id,
            title = request.title.ifBlank { "Untitled" },
            width = request.width,
            height = request.height,
            fps = request.fps
        )
        dao.upsert(
            ProjectEntity(
                id = id,
                title = scene.title,
                createdAt = now,
                modifiedAt = now,
                width = scene.width,
                height = scene.height,
                fps = scene.fps,
                sceneJson = json.encodeToString(scene)
            )
        )
        return ProjectMeta(id, scene.title, now, now, scene.width, scene.height, scene.fps)
    }

    suspend fun saveScene(scene: Scene) {
        val existing = dao.getById(scene.id)
        dao.upsert(
            ProjectEntity(
                id = scene.id,
                title = scene.title,
                createdAt = existing?.createdAt ?: System.currentTimeMillis(),
                modifiedAt = System.currentTimeMillis(),
                width = scene.width,
                height = scene.height,
                fps = scene.fps,
                sceneJson = json.encodeToString(scene)
            )
        )
    }

    suspend fun deleteProject(id: String) = dao.delete(id)
}
