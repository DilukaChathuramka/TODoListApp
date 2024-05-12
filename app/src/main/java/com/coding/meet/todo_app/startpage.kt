package com.coding.meet.todo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class startpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)

        var button1 = findViewById<Button>(R.id.startbtn)
        button1.setOnClickListener{
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }
    }
}