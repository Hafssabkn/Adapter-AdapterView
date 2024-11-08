package com.example.myadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val lv = findViewById<ListView>(R.id.affichage)

        val data = listOf(
            mapOf("codep" to "palestine","mo" to "Pround","codeiso" to "PP"),
            mapOf("codep" to "Algerie","mo" to "Pround","codeiso" to "DZR"),
            mapOf("codep" to "Afghanistan","mo" to "Pround","codeiso" to "AFN"),
            mapOf("codep" to "Arabie Saoudite","mo" to "Pround","codeiso" to "SAR"),
            mapOf("codep" to "Belgique","mo" to "Pround","codeiso" to "EUR"),
            mapOf("codep" to "Bresil","mo" to "Pround","codeiso" to "BRL"),
            mapOf("codep" to "Cote d'Ivoire","mo" to "Pround","codeiso" to "XOF")
        )

        var adapter = SimpleAdapter(
            this,
            data,
            R.layout.list_item_country,
            arrayOf("codep", "mo", "codeiso"),
            intArrayOf(R.id.codep,R.id.mo,R.id.codeiso)
        )

        lv.adapter = adapter
    }
}