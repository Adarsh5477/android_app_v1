package com.example.christite_v1
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle

//class MainActivity2 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
//    }
//}

//package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private var username: String = ""
    private var password: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.button)

        loginButton.backgroundTintList = ContextCompat.getColorStateList(this, R.color.white)

        loginButton.setOnClickListener {
            username = usernameEditText.text.toString()
            password = passwordEditText.text.toString()

            usernameEditText.clearFocus()
            passwordEditText.clearFocus()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username or password cannot be empty", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("name", username)
                Toast.makeText(this, "name = $username", Toast.LENGTH_SHORT)
                    .show()
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}