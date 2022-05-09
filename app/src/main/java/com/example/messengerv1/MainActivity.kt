package com.example.messengerv1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msgs = ArrayList<String>()

        val ButtonSendMsg: Button = findViewById(R.id.button_message_send)
        val RecyclerViewMsg: RecyclerView  = findViewById(R.id.recycler_view)
        val EditTextWriteMsg: EditText = findViewById(R.id.edit_text_message_write)

        RecyclerViewMsg.layoutManager = LinearLayoutManager(this)
        var dataAdapter: DataAdapter = DataAdapter(msgs)
        RecyclerViewMsg.adapter = dataAdapter

        ButtonSendMsg.setOnClickListener {
            val message = EditTextWriteMsg.text.toString()
            msgs.add(message)
            dataAdapter.notifyDataSetChanged()
            EditTextWriteMsg.setText("")
        }


    }
}