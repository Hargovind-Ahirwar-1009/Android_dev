package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnbutton = findViewById<Button>(R.id.button2)

        btnbutton.setOnClickListener{
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}