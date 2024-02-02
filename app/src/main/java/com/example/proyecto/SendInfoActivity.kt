package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.proyecto.dao.AppDatabase
import com.example.proyecto.databinding.ActivitySendInfoBinding

class SendInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendInfoBinding

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = Room
            .databaseBuilder(
                this,
                AppDatabase::class.java,
                AppDatabase.DATABASE_NAME
            )
            .allowMainThreadQueries().build()


        binding.save.setOnClickListener { v ->

        }
    }
}
/*val isbn = binding.isbnEditText.text.toString()
            val title = binding.titleEditText.text.toString()
            val author = binding.authorEditText.text.toString()
            val description = binding.descriptionEditText.text.toString()

            val book = Book(
                isbn = isbn,
                title = title,
                author = author,
                description = description
            )*/