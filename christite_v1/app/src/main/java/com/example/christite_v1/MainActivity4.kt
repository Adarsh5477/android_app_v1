package com.example.christite_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val back=findViewById<Button>(R.id.button4)

        back.setOnClickListener(){
           setContentView(R.layout.activity_main)
        }
    }
}