package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecuperarSenhaActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery_scream3)

        val confirmarCodigoSenha = findViewById<Button>(R.id.confirmarCodigoSenha)
        confirmarCodigoSenha.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaActivity4::class.java)
            startActivity(intent)
        }
    }
}