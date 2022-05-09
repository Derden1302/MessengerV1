package com.example.messengerv1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val ButtonSendMsg: Button? = findViewById(R.id.button_message_send)
    val EditTextWriteMsg: EditText? = findViewById(R.id.edit_text_message_write)
    val RecyclerViewMsg: RecyclerView? = findViewById(R.id.recycler_view)

    var msgs = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerViewMsg?.setLayoutManager(LinearLayoutManager(this))

        val dataAdapter = DataAdapter(this, msgs)
        RecyclerViewMsg?.setAdapter(dataAdapter)



    }
}