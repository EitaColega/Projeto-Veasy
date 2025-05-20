package com.example.projectveasy
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.homeScream)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnGames = findViewById<Button>(R.id.btnGames)
        btnGames.setOnClickListener {
            val intent = Intent(this, MainGamesActivity::class.java)
            startActivity(intent)
        }

        val btnOptions = findViewById<Button>(R.id.btnOptions)
        btnOptions.setOnClickListener {
            val intent = Intent(this, MainOptionsActivity::class.java)
            startActivity(intent)
        }

    }



}