package com.example.christite_v1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog


class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val fab=findViewById<Button>(R.id.fab)
val vv=findViewById<VideoView>(R.id.videoView)

        val path="android.resorce://${packageName}/${R.raw.christ}"

        vv.setVideoURI(Uri.parse(path))
        fab.setOnClickListener(){
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Alert")
            .setMessage("Are you sure you want to proceed?")
            .setPositiveButton("Yes") { dialog, which ->
                //setContentView(R.layout.activity_main5)
                Toast.makeText(this, "sucess", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, MainActivity5::class.java)
                startActivity(intent)
            }
            alertDialogBuilder.setNegativeButton("No") { dialog, which ->
                // Handle negative button click
                //setContentView(R.layout.activity_main)
                Toast.makeText(this, "falied", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }



}