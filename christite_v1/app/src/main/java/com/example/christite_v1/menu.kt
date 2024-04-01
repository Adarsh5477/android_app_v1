package com.example.christite_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton



class menu : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.life ->{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                return true
            }
            R.id.website ->{
                val implicitIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://christuniversity.in/")
                )
                startActivity(implicitIntent)
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu, menu)
    }

    // Override onContextItemSelected to handle clicks on context menu items
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.life -> {
                // Handle action to view the application form
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                return true
            }

            R.id.website -> {
                // Handle action to view the application form
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                return true
            }
            // Add more cases if you have more menu items
            else -> return super.onContextItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = intent.getStringExtra("USERNAME") ?: ""

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Welcome, $username!"

        val toolbar = findViewById<Toolbar>(R.id.toolbar) // Find the toolbar
        setSupportActionBar(toolbar)

        // Find the button
        val button = findViewById<Button>(R.id.button1)

        // Register the button for the context menu
        registerForContextMenu(button)

//        findViewById<Button>(R.id.button1).setOnClickListener {
//            val implicitIntent = Intent(
//                Intent.ACTION_VIEW,
//                Uri.parse("https://christuniversity.in/")
//            )
//            startActivity(implicitIntent)
//        }
//        findViewById<Button>(R.id.button1).setOnClickListener {
//            val intent = Intent(this, MainActivity3::class.java)
//            startActivity(intent)
//            finish()
//            startActivity(intent)
//        }

//        findViewById<Button>(R.id.button3).setOnClickListener {
//            val intent = Intent(this, MainActivity3::class.java)
//            startActivity(intent)
//            finish()
//            startActivity(intent)
//        }

//        findViewById<Button>(R.id.button4).setOnClickListener {
//            val intent = Intent(this, feedback::class.java)
//            startActivity(intent)
//            finish()
//            startActivity(intent)
//        }

//        findViewById<Button>(R.id.fab).setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }

//        val fab: FloatingActionButton = findViewById(R.id.fab)
//        fab.setOnClickListener {
//            // Create and show the alert dialog
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("Logout")
//                .setMessage("Are you sure you want to log out?")
//                .setPositiveButton("Yes") { dialog, which ->
//                    // Handle logout logic here
//                    // For example, you can start the login activity or clear session data
//                    val intent = Intent(this, Login::class.java)
//                    startActivity(intent)
//                }
//                .setNegativeButton("No") { dialog, which ->
//                    // Dismiss the dialog
//                    dialog.dismiss()
//                }
//                .show()
//        }
        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        // Set an OnClickListener to show the popup menu
        imageButton.setOnClickListener {
            // Inflate the menu
            val popupMenu = PopupMenu(this, imageButton)
            popupMenu.inflate(R.menu.menu)

            // Set item click listener for the popup menu
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.life -> {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        true
                    }

                    R.id.website -> {
                        // Handle item 2 click
                        val intent = Intent(this, MainActivity2::class.java)
                        startActivity(intent)
                        true
                    }

                    else -> return@setOnMenuItemClickListener false
                }
            }

            // Show the popup menu
            popupMenu.show()

        }
    }
}