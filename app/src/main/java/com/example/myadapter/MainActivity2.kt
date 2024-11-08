package com.example.myadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val listV = findViewById<ListView>(R.id.lv1)
//        val language = listOf(
//            hashMapOf("langage" to "Kotlin", "year" to "2011"),
//            hashMapOf("langage" to "Java", "year" to "1995"),
//            hashMapOf("langage" to "C#", "year" to "2000"),
//            hashMapOf("langage" to "Swift", "year" to "2014")
//        )

        val language = listOf(
            hashMapOf("langage" to "Kotlin", "year" to "2011","icon" to R.drawable.kotlin),
            hashMapOf("langage" to "Java", "year" to "1995","icon" to R.drawable.java),
            hashMapOf("langage" to "C#", "year" to "2000","icon" to R.drawable.c),
            hashMapOf("langage" to "Swift", "year" to "2014","icon" to R.drawable.swift)
        )


        var adapter = SimpleAdapter(
            this,
            language,
            R.layout.list_langage,
            arrayOf("icon","langage","year"),
            intArrayOf(R.id.icon,R.id.text1,R.id.text2)
        )

        listV.adapter = adapter
    }
}