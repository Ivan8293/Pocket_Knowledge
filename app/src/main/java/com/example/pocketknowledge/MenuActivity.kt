package com.example.pocketknowledge

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Находим кнопки по ID
        val buttonOpenFact = findViewById<Button>(R.id.MainButton)
        val buttonOpenCategories = findViewById<Button>(R.id.CatButton)
        val buttonOpenFavorites = findViewById<Button>(R.id.favorButton)
        val buttonOpenMenu = findViewById<Button>(R.id.button_menu)
        val buttonOpenHistory = findViewById<Button>(R.id.history)

        // Устанавливаем обработчики нажатия
        buttonOpenFact.setOnClickListener {
            Log.d("MenuActivity", "Открываем FactActivity")
            val intent = Intent(this, FactActivity::class.java)
            startActivity(intent)
        }

        buttonOpenCategories.setOnClickListener {
            Log.d("MenuActivity", "Открываем CategoryActivity")
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        buttonOpenFavorites.setOnClickListener {
            Log.d("MenuActivity", "Открываем FavoriteActivity")
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }

        buttonOpenMenu.setOnClickListener {
            Log.d("MenuActivity", "Открываем MenuActivity")
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        buttonOpenHistory.setOnClickListener {
            Log.d("MenuActivity", "Открываем HistoryActivity")
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}
