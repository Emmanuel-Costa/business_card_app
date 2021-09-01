package br.com.example.businesscard

import android.app.Application
import br.com.example.businesscard.data.AppDatabase
import br.com.example.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}