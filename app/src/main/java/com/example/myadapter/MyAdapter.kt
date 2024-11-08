package com.example.myadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapter(val context: Context, val liste: ArrayList<HashMap<String, String>>) : BaseAdapter() {

    override fun getCount(): Int {
        return liste.size
    }

    override fun getItem(p0: Int): Any {
        return liste[p0]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup): View {
        val view = p1 ?: LayoutInflater.from(context).inflate(R.layout.list_pers, p2, false)

        val nomTextView: TextView = view.findViewById(R.id.nom)
        val prenomTextView: TextView = view.findViewById(R.id.prenom)
        val ageTextView: TextView = view.findViewById(R.id.age)

        val personne = liste[p0]
        val nom = personne["nom"]
        val prenom = personne["prenom"]
        val age = personne["age"]?.toInt()

        nomTextView.text = nom
        prenomTextView.text = prenom
        ageTextView.text = age.toString()

        val color = when {
            age!! < 18 -> android.R.color.holo_green_light
            age > 60 -> android.R.color.holo_blue_light
            else -> android.R.color.black
        }

        nomTextView.setTextColor(context.resources.getColor(color))

        return view
    }
}