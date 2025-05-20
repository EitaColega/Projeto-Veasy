package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecuperarSenhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery_screen)

        val brnEnviarEmail = findViewById<Button>(R.id.EnviarEmail)
        brnEnviarEmail.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaActivity2::class.java)
            startActivity(intent)
        }
    }
}
