package com.example.pocketknowledge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val LinearLayoutCategory = findViewById<LinearLayout>(R.id.category_button)
        val LinearLayoutFact = findViewById<LinearLayout>(R.id.fact_button)
        val LinearLayoutFavorite = findViewById<LinearLayout>(R.id.favorite_button)
        val LinearLayoutMenu = findViewById<LinearLayout>(R.id.menu_button)

        LinearLayoutCategory.setOnClickListener {
            // Код, который будет выполнен при нажатии
            Log.d("CategoryActivity", "Открываем CategoryActivity")
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        LinearLayoutFact.setOnClickListener {
            // Код, который будет выполнен при нажатии
            Log.d("FactActivity", "Открываем FactActivity")
            val intent = Intent(this, FactActivity::class.java)
            startActivity(intent)
        }

        LinearLayoutFavorite.setOnClickListener {
            // Код, который будет выполнен при нажатии
            Log.d("FavoriteActivity", "Открываем FavoriteActivity")
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }

        LinearLayoutMenu.setOnClickListener {
            // Код, который будет выполнен при нажатии
            Log.d("MenuActivity", "Открываем MenuActivity")
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}