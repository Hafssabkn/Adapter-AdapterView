package com.example.myadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val lv = findViewById<ListView>(R.id.affichage)

        val data = listOf(
            mapOf("nompays" to "palestine","capitale" to "Al-Qods","continent" to "PP"),
            mapOf("nompays" to "Alanie","capitale" to "Tirana","continent" to "PP"),
            mapOf("nompays" to "Algerie","capitale" to "Alger","continent" to "DZR"),
            mapOf("nompays" to "Afghanistan","capitale" to "Kaboul","continent" to "AFN"),
            mapOf("nompays" to "Andorre","capitale" to "Andorre-la-vieille","continent" to "EUR"),
            mapOf("nompays" to "Angola","capitale" to "Luanda","continent" to "BRL"),
            mapOf("nompays" to "Argentine","capitale" to "Buenos Aires","continent" to "XOF")
        )

        var adapter = SimpleAdapter(
            this,
            data,
            R.layout.list_pays,
            arrayOf("nompays", "capitale", "continent"),
            intArrayOf(R.id.nompays,R.id.capitale,R.id.continent)
        )

        lv.adapter = adapter
    }
}