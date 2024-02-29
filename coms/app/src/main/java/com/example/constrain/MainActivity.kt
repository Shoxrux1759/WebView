package com.example.constrain

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var singnIn = findViewById<TextView>(R.id.signIn)
        var btn = findViewById<Button>(R.id.editBtn1)
        var name = findViewById<TextInputEditText>(R.id.editName)
        var phone = findViewById<TextInputEditText>(R.id.editNumber)
        var password = findViewById<TextInputEditText>(R.id.editPassword)
        singnIn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        })

        btn.setOnClickListener(View.OnClickListener {

            if (name.text.isNullOrEmpty()) {
                name.error = "Foydalanuvchi nomini kiriting"
            } else if (phone.text.isNullOrEmpty()) {
                phone.error = "Telefon nomerini kiriting"
            } else if (password.text.isNullOrEmpty()) {
                password.error = "Parolni kiriting"
            } else {
                // Barcha maydonlar to'ldirilgan bo'lsa, ikkinchi oynaga o'tish
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }

        })


    }


}