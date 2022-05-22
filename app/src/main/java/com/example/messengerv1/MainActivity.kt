package com.example.messengerv1

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msgs = ArrayList<String>()
        val dates = ArrayList<String>()

        val ButtonSendMsg: ImageButton = findViewById(R.id.button_message_send)
        val RecyclerViewMsg: RecyclerView  = findViewById(R.id.recycler_view)
        val EditTextWriteMsg: EditText = findViewById(R.id.edit_text_message_write)

        RecyclerViewMsg.layoutManager = LinearLayoutManager(this)
        var dataAdapter: DataAdapter = DataAdapter(msgs,dates)
        RecyclerViewMsg.adapter = dataAdapter

        ButtonSendMsg.setOnClickListener {
            val message = EditTextWriteMsg.text.toString()
            val sdf = SimpleDateFormat("dd/M/yyyy hh:mm")
            val currentDate = sdf.format(Date())
            if (message != "" ){
                msgs.add(message)
                dates.add(currentDate)
                dataAdapter.notifyDataSetChanged()
                EditTextWriteMsg.setText("")
            }

        }
    }
}