package com.example.vsple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.vsple.R

class MainActivity2 : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button = findViewById(R.id.btnSecond2)
        button.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}