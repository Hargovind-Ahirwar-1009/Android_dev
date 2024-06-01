package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnintent = findViewById<Button>(R.id.button)

        btnintent.setOnClickListener{
            //open new activity

            intent = Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)


        }
    }
}