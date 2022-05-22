package com.example.messengerv1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

public class DataAdapter(private val msgs: List<String>,private val dates: List<String>) :
    RecyclerView.Adapter<ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_message, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.msg1.text = msgs[position]
        holder.msg2.text = dates[position]
    }

    override fun getItemCount(): Int {
        return msgs.size
    }
}