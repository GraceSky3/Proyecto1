package com.example.proyecto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "juego")
data class Games(
    @PrimaryKey val title: String,
    @ColumnInfo("categoria") val categoria: String,
    @ColumnInfo ("descripción")val plataforma: String,
    @ColumnInfo("autor") val reseña: String) {

}

