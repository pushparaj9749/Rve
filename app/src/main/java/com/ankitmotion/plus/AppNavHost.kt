package com.ankitmotion.plus

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ankitmotion.feature.editor.EditorScreen
import com.ankitmotion.feature.home.HomeScreen

@Composable
fun AppNavHost() {
    val viewModel: MainViewModel = viewModel()
    val projects by viewModel.projects.collectAsState()
    val reverseState by viewModel.reverseState.collectAsState()
    val exportState by viewModel.exportState.collectAsState()
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                projects = projects,
                onOpenProject = { id -> navController.navigate("editor/$id") },
                onCreateProject = { viewModel.createProject(it) }
            )
        }
        composable(
            route = "editor/{projectId}",
            arguments = listOf(navArgument("projectId") { type = NavType.StringType })
        ) { entry ->
            val projectId = entry.arguments?.getString("projectId").orEmpty()
            LaunchedEffect(projectId) { viewModel.openProject(projectId) }
            val scene by viewModel.editorScene.collectAsState()

            EditorScreen(
                scene = scene,
                onBack = { navController.popBackStack() },
                onExport = { viewModel.exportScene(it) },
                onSceneChanged = { viewModel.saveScene(it) },
                onReverse = { uri, settings -> viewModel.reverseVideo(Uri.parse(uri), settings) },
                onImportProject = { viewModel.importProject(it) },
                onExportProject = { scene, uri -> viewModel.exportProject(scene, uri) },
                reverseState = reverseState,
                exportState = exportState,
                projects = projects
            )
        }
    }
}
