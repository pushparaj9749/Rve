package com.ankitmotion.plus

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.ankitmotion.core.database.AppDatabase
import com.ankitmotion.core.database.ProjectRepository

class AppContainer(context: Context) {
    private val database = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java,
        "ankit_motion_plus.db"
    ).build()

    val repository = ProjectRepository(database.projectDao())
}

class AnkitMotionApplication : Application() {
    lateinit var container: AppContainer
        private set

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(this)
    }
}

fun Context.appContainer(): AppContainer =
    (applicationContext as AnkitMotionApplication).container
