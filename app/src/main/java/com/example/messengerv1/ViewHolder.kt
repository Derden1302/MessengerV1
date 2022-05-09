package com.example.messengerv1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var msg: TextView = itemView.findViewById(R.id.text_view_message)

}
