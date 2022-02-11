package com.example.appstudy16

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyListAdapter(private val data:List<ListItem>): RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.prefecture.text = data[position].prefecture
        holder.tag.text = data[position].tag
        holder.desc.text = data[position].desc
        //holder.imgV.setImageResource(R.drawable.man_red)

        //都道府県区分で表示アイコンを切り替える
        val value = data[position].todoufukenKubun
        when {
            value == "to" -> holder.imgV.setImageResource(R.drawable.tokubun2)
            value == "dou" -> holder.imgV.setImageResource(R.drawable.doukubun)
            value == "fu" -> holder.imgV.setImageResource(R.drawable.fukubun)
            value == "ken" -> holder.imgV.setImageResource(R.drawable.kenkubun)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}