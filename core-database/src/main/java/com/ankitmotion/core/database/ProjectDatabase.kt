package com.ankitmotion.core.database

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "projects")
data class ProjectEntity(
    @PrimaryKey val id: String,
    val title: String,
    val createdAt: Long,
    val modifiedAt: Long,
    val width: Int,
    val height: Int,
    val fps: Int,
    val sceneJson: String
)

@Dao
interface ProjectDao {
    @Query("SELECT * FROM projects ORDER BY modifiedAt DESC")
    fun observeAll(): Flow<List<ProjectEntity>>

    @Query("SELECT * FROM projects WHERE id = :id")
    suspend fun getById(id: String): ProjectEntity?

    @Upsert
    suspend fun upsert(entity: ProjectEntity)

    @Query("DELETE FROM projects WHERE id = :id")
    suspend fun delete(id: String)
}

@Database(entities = [ProjectEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun projectDao(): ProjectDao
}
