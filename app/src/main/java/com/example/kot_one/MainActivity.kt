package com.example.kot_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.kot_one.R

class MainActivity : AppCompatActivity() {
    lateinit var btnHello : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello = findViewById<Button>(R.id.hello_button)
        btnHello.setOnClickListener(){
            Toast.makeText(
                this,
                "Hello Kotlin",
                Toast.LENGTH_LONG).show()
        }
    }
}