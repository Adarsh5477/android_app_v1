package com.example.christite_v1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        Log.i("adarsh", "created")

        val vv = findViewById<VideoView>(R.id.videoView)

        // val path="android.resorce://${packageName}/${R.raw.christpromo}"
        val path = "android.resorce://" + packageName + "/" + R.raw.christ
        vv.setVideoURI(Uri.parse(path))


        val fab = findViewById<FloatingActionButton>(R.id.fab)
        Log.d("[FAB]", "${fab.id}")
        fab.setOnClickListener() {
            Log.d(
                "[FAB]",
                "FAB clicked()"
            )
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

            val card=findViewById<CardView>(R.id.cardView2)

            card.setOnClickListener(){
                Toast.makeText(this, "card clicked", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }


}