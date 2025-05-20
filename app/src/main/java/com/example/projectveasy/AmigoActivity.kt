package com.example.projectveasy

data class AmigoActivity(
    val nome: String,
    val statusOnline: Boolean,
    val imagem: Int, // referência do drawable
    val frase: String,
    val winStreak: Int,
    val torneiosVencidos: List<Int>,
    var expandido: Boolean = false
)
