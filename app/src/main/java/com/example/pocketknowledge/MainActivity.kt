package com.example.pocketknowledge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenMenu = findViewById<Button>(R.id.button_start)

        // Устанавливаем обработчик нажатия
        buttonOpenMenu.setOnClickListener {
            Log.d("MainActivity", "Открываем MenuActivity")
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
