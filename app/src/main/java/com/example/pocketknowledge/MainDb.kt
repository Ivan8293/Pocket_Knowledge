package com.example.pocketknowledge

import AppDatabase
import android.app.Application
import androidx.room.Room
import com.example.pocketknowledge.entities.Category
import com.example.pocketknowledge.entities.Fact
import com.example.pocketknowledge.entities.User
import com.example.pocketknowledge.entities.UserFact
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyDatabaseInitializer(private val database: AppDatabase) {
    fun initialize() {
        CoroutineScope(Dispatchers.IO).launch {
            if (database.categoryDao().getAllCategories().isEmpty()) { // Проверка на наличие категорий
                initDatabase() // Вызов suspend функции
            }
        }
    }

    private suspend fun initDatabase() {
        // Заполнение таблицы Category
        val categories = listOf(
            Category(1, "Наука"),
            Category(2, "Технологии"),
            Category(3, "История"),
            Category(4, "Культура")
        )
        database.categoryDao().insert(categories)

        // Заполнение таблицы Fact
        val facts = listOf(
            Fact(1, 1, "Факт о науке 1", "https://example.com/fact1"),
            Fact(2, 1, "Факт о науке 2", "https://example.com/fact2"),
            // ... остальные факты
        )
        database.factDao().insert(facts)

        // Заполнение таблицы User
        val users = listOf(
            User(1, "user1"),
            User(2, "user2"),
            User(3, "user3")
        )
        database.userDao().insert(users)

        // Заполнение таблицы UserFact
        val userFacts = listOf(
            UserFact(1, 1, 1, true, true, true),
            // ... остальные UserFact
        )
        database.userFactDao().insert(userFacts)
    }
}

class MyApplication : Application() {
    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database"
        ).build()

        // Инициализация базы данных
        MyDatabaseInitializer(database).initialize()
    }
}

