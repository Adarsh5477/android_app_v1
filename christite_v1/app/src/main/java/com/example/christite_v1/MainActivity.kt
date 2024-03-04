package com.example.christite_v1

//import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO
        Log.d("[FAB]", "FAB")
        val instagramButton = findViewById<Button>(R.id.instagram)
        val galleryButton = findViewById<Button>(R.id.gallery)
        val aboutButton=findViewById<Button>(R.id.about)
        val applyButton=findViewById<Button>(R.id.info)
        val vidButton=findViewById<Button>(R.id.vid)
        galleryButton.setOnClickListener(){
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        instagramButton.setOnClickListener(){
            Toast.makeText(this,"instagram  clicked", Toast.LENGTH_SHORT).show()
            val implicitintent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/christ_university_bangalore/"))

            startActivity(implicitintent)
        }

        aboutButton.setOnClickListener(){
            val explicitintent=Intent(this,MainActivity2::class.java)
            startActivity(explicitintent)
        }
        applyButton.setOnClickListener(){
            val explicitintent1=Intent(this,MainActivity5::class.java)
            startActivity(explicitintent1)
        }
        vidButton.setOnClickListener(){
            val explicitintent2=Intent(this,MainActivity6::class.java)
            startActivity(explicitintent2)
        }
    }
}