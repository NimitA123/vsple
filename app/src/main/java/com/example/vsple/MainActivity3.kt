package com.example.vsple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button = findViewById(R.id.btnThird)
        button.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}