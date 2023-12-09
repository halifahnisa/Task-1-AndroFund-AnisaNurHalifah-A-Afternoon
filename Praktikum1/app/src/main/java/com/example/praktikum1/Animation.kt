package com.example.praktikum1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Animation : AppCompatActivity() {
    private lateinit var button2 : Button
    private lateinit var textview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        button2 = findViewById(R.id.button2)
        textview = findViewById(R.id.textview2)
    }
}