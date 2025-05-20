package com.example.projectveasy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AmigoAdapterActivity(private val amigoActivities: MutableList<AmigoActivity>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TIPO_COMPACTO = 0
    private val TIPO_EXPANDIDO = 1

    override fun getItemViewType(position: Int): Int {
        return if (amigoActivities[position].expandido) TIPO_EXPANDIDO else TIPO_COMPACTO
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return if (viewType == TIPO_EXPANDIDO) {
            val view = inflater.inflate(R.layout.activity_main_games_item_amigo_expandido, parent, false)
            ExpandidoViewHolder(view)
        } else {
            val view = inflater.inflate(R.layout.activity_main_games_item_amigo, parent, false)
            CompactoViewHolder(view)
        }
    }

    override fun getItemCount(): Int = amigoActivities.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val amigo = amigoActivities[position]

        if (holder is CompactoViewHolder) {
            holder.img.setImageResource(amigo.imagem)
            holder.itemView.setOnClickListener {
                amigo.expandido = true
                notifyItemChanged(position)
            }
        } else if (holder is ExpandidoViewHolder) {
            holder.img.setImageResource(amigo.imagem)
            holder.nome.text = amigo.nome
            holder.status.text = if (amigo.statusOnline) "ONLINE" else "OFFLINE"
            holder.frase.text = amigo.frase
            holder.winStreak.text = "WIN STREAK: ${amigo.winStreak}"

            holder.btnDesafiar.setOnClickListener {
                Toast.makeText(holder.itemView.context, "Desafiou ${amigo.nome}", Toast.LENGTH_SHORT).show()
            }

            holder.itemView.setOnClickListener {
                amigo.expandido = false
                notifyItemChanged(position)
            }
        }
    }

    inner class CompactoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgAmigo)
    }

    inner class ExpandidoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgAmigo)
        val nome: TextView = view.findViewById(R.id.nome)
        val status: TextView = view.findViewById(R.id.status)
        val frase: TextView = view.findViewById(R.id.frase)
        val winStreak: TextView = view.findViewById(R.id.winStreak)
        val btnDesafiar: Button = view.findViewById(R.id.btnDesafiar)
    }
}
