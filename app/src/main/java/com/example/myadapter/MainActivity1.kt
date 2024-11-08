package com.example.myadapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        val listV = findViewById<ListView>(R.id.lv)
        var language = listOf("java","C#","Kotlin","Swift")

        //var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,language)

        //var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,language)

        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,language)

        listV.adapter = adapter
        //listV.choiceMode = ListView.CHOICE_MODE_SINGLE
        listV.choiceMode = ListView.CHOICE_MODE_MULTIPLE
    }
}