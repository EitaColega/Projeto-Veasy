package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen2_riotid)


        val btn_conf_riot_id = findViewById<TextView>(R.id.btn_conf_riot_id)
        btn_conf_riot_id.setOnClickListener {
            val intent = Intent(this, RegistroActivity3::class.java)
            startActivity(intent)
        }


    }
}
