package com.example.pocketknowledge

import androidx.room.RoomDatabase
import androidx.room.Room
import androidx.room.Database
import androidx.content.Context

abstract class MainDb : RoomDatabase {
    companion object{
        fun getDb(): MainDb{
            return Room.databaseBuilder()
        }
    }
}