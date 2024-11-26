package com.example.pocketknowledge.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Category")
data class Category(
    @PrimaryKey val id_category: Int,
    val name: String
)


