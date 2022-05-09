package com.example.messengerv1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val msg: TextView = itemView.findViewById(R.id.text_view_message)
}