package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class RecuperarSenhaActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery_screen4)

        val btnContinuarSenha = findViewById<Button>(R.id.BtnContinuarSenha)
        btnContinuarSenha.setOnClickListener {
            val intent = Intent(this, EscolhaActivity::class.java)
            startActivity(intent)
        }
    }
}