package com.example.myadapter

import android.os.Bundle

import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        val lv = findViewById<ListView>(R.id.lv)

        val listPers = arrayListOf(
            hashMapOf("nom" to "ALAMI", "prenom" to "Mohammed", "age" to "38"),
            hashMapOf("nom" to "ALAOUI", "prenom" to "Taha", "age" to "65"),
            hashMapOf("nom" to "IQBAL", "prenom" to "Imane", "age" to "15"),
            hashMapOf("nom" to "ALAMI", "prenom" to "Nada", "age" to "24"),
            hashMapOf("nom" to "SELLAM", "prenom" to "Issam", "age" to "12")
        )

        val adapter = MyAdapter(this, listPers)

        lv.adapter = adapter
    }
}