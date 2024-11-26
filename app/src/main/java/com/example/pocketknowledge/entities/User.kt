package com.example.pocketknowledge.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User(
    @PrimaryKey val id_user: Int,
    val username: String
)