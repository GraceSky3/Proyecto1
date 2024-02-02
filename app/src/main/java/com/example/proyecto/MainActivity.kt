package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* binding.recycler.adapter = GamesAdapter(
            listOf(
                Games("Assassins Creed","parkour","Play 4", "Bugs"),
                Games("Resident evil 4 Remake","Survival Horror", "Play 5","Goty"),
                Games("Until Dawn","Juego de decisión","PC","infravalorado"),
                Games("The sims 4 ","Simulación","PC","Muy caro")

            )
        )*/
        binding.add.setOnClickListener {
            val createBookIntent = Intent(
                this, SendInfoActivity::class.java
            )

            startActivity(createBookIntent)
        }
    }
}