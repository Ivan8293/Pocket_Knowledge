package com.example.pocketknowledge.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Пользователь_Факт")
data class UserFact(
    @PrimaryKey val id_user_fact: Int,
    val fact_id: Int,
    val user_id: Int,
    val like: Boolean,
    val favourites: Boolean,
    val look: Boolean
)