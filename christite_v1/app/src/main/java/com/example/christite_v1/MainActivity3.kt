package com.example.christite_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val text=findViewById<TextView>(R.id.text)
        val btn=findViewById<Button>(R.id.button2)
        val extra=intent.extras
        val value=extra?.getString("name")
//        Toast.makeText(this, "name = $value", Toast.LENGTH_SHORT)
//            .show()
        text.text=value
        btn.setOnClickListener(){
            Toast.makeText(this, "feed back submitted", Toast.LENGTH_LONG)
                .show()
            setContentView(R.layout.activity_main)
        }
    }
}