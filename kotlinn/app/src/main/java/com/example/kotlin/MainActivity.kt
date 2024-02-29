package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, PhotoActivity::class.java)
            startActivity(intent)
        }
    }
}