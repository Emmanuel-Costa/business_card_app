package br.com.example.businesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "BC_TABLE")
data class BusinessCard (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val empresa: String,
    val telefone:  String,
    val email: String,
    val fundoPersonalizado: String
        )