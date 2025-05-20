package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecuperarSenhaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery_screen2)

        val btnConfirmarCodigoSenha = findViewById<Button>(R.id.ConfirmarCodigoSenha)
        btnConfirmarCodigoSenha.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaActivity3::class.java)
            startActivity(intent)
        }
    }

}