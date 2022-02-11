package com.example.appstudy16

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val prefecture= itemView.findViewById<TextView>(R.id.prefecture)
    val tag= itemView.findViewById<TextView>(R.id.tag)
    val desc= itemView.findViewById<TextView>(R.id.desc)
    val imgV = itemView.findViewById<ImageView>(R.id.imgV)

}