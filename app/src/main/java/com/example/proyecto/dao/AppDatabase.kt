package com.example.proyecto.dao

import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.proyecto.Games

@Database(entities = [Games::class], version = 2)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    companion object{
        val DATABASE_NAME = "library"

    }
    abstract fun gamesDao(): Games
}

