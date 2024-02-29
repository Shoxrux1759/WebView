package com.example.twitterkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buton = findViewById<Button>(R.id.button)

        buton.setOnClickListener {
            fun onClick(view: View?) {
                val intent = Intent(this@MainActivity, PhotoActivity::class.java)
                startActivity(intent)
            }
        }

    }
}