package com.example.projectveasy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainGamesActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_games)

        val rootView = findViewById<View>(R.id.main_games_screen)

        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnOptions = findViewById<Button>(R.id.btnOptions)
        btnOptions.setOnClickListener {
            val intent = Intent(this, MainOptionsActivity::class.java)
            startActivity(intent)
        }

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }

        recycler = findViewById(R.id.recyclerAmigos)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)



        val amigoActivities = mutableListOf(
            AmigoActivity("G4BIRU", true, R.drawable.gabiru, "\"Pegue...\"", 12, listOf(), false),
            AmigoActivity("RatoVeasy", true, R.drawable.ratodoveasy, "\"Let’s go!\"", 7, listOf(), false),
            AmigoActivity("Baki", false, R.drawable.icon_baki, "\"Dormindo\"", 0, listOf(), false),
            AmigoActivity("MegDbd", true, R.drawable.icon_meg, "\"Sempre alerta\"", 5, listOf(), false),
            AmigoActivity("Cornogifrudo", false, R.drawable.icon_corno, "\"Conectando...\"", 1, listOf(), false),
            AmigoActivity("Chereka", true, R.drawable.icon_sherek, "\"Na sombra\"", 8, listOf(), false)
        )


        recycler.adapter = AmigoAdapterActivity(amigoActivities)
    }
}
