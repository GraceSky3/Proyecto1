package com.example.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.databinding.ActivityMainBinding
import com.example.proyecto.databinding.ViewGameItemBinding

class GamesAdapter(private val gamess: List<Games>): RecyclerView.Adapter<GamesAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ViewGameItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return gamess.size //retorna el numero de videojuegos
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(gamess[position])
    }
    class ViewHolder(private val binding: ViewGameItemBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind(game: Games){
            binding.titttle.text = game.title
            binding.categ.text = game.categoria
            binding.plataform.text = game.plataforma
            binding.review.text = game.reseña
        }
    }

}