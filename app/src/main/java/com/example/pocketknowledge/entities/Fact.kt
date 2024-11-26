package com.example.pocketknowledge.entities

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "Fact")
data class Fact(
    @PrimaryKey val id_fact: Int,
    val id_category: Int,
    val description: String,
    val link: String
)