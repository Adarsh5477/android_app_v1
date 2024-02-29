package com.example.christite_v1

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val timePicker = findViewById<TimePicker>(R.id.timepicker)
        timePicker.setOnTimeChangedListener { _, hour, minute -> var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {hour == 0 -> { hour += 12
                am_pm = "AM"
            }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> { hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            val hr = if (hour < 10) "0$hour" else hour
            val min = if (minute < 10) "0$minute" else minute
            // display format of time
            val msg = "Time selected : $hr : $min $am_pm"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
        //Datepicker
        val datePicker = findViewById<DatePicker>(R.id.datepicker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->
            val month = month + 1
            val msg = "You Selected: $day/$month/$year"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }

//        Log.i("External Storage Dir",Environment.getExternalStorageDirectory().getPath())
//        //video view
//        videoview = findViewById(R.id.YTvideoView)
//        videoview.setVideoURI(videoUrl)
//        val mediaController = MediaController(this)
////        mediaController.setAnchorView(videoview)
////        mediaController.setMediaPlayer(videoview)
//        videoview.setMediaController(mediaController)
//        videoview.start()
//        videoview.setOnCompletionListener {
//            videoview.start()
//        }

        //webview
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://m.christuniversity.in/departments/main%20campus/school%20of%20sciences/computer%20science")

        val btn=findViewById<Button>(R.id.submit)
        btn.setOnClickListener(){
            Toast.makeText(this, "application submitted", Toast.LENGTH_LONG)
                .show()
            setContentView(R.layout.activity_main)
        }
    }

}
