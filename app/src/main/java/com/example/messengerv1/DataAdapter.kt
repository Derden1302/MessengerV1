package com.example.messengerv1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class DataAdapter(context: Context?, var msgs: ArrayList<String>?) :
    RecyclerView.Adapter<ViewHolder>() {
    var inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.item_message, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val messages = msgs!![position]
        holder.msg!!.text = messages
    }

    override fun getItemCount(): Int {
        return if (msgs != null) msgs!!.size else 0
    }

}