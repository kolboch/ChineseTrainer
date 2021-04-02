package com.kakaboc.chinesetrainer.database

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow

@Database(entities = [Hanzi::class], version = 1)
abstract class MainDatabase : RoomDatabase() {
    abstract fun getHanziDao(): HanziDao
}

@Dao
interface HanziDao {
    @Query("SELECT * FROM hanzi")
    fun getAll(): Flow<List<Hanzi>>
}
