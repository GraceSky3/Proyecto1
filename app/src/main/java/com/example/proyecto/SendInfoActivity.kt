package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyecto.databinding.ActivitySendInfoBinding

class SendInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener { v ->
            Toast
                .makeText(
                    this,
                    "Guardado",
                    Toast.LENGTH_SHORT)
                .show()
        }
    }
}