package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        val bntconfirmar = findViewById<Button>(R.id.RGconfirmar)
        bntconfirmar.setOnClickListener {
            val intent = Intent(this, RegistroActivity2::class.java)
            startActivity(intent)
        }

    }
}
