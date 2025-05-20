package com.example.projectveasy
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen) // esse é o XML da tela de login

        val forgotPassword = findViewById<TextView>(R.id.textForgotPassword)
        forgotPassword.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaActivity::class.java)
            startActivity(intent)
        }

        val buttonLogin = findViewById<TextView>(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }

    }



}

