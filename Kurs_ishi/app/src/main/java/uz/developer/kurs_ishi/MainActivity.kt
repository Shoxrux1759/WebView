package uz.developer.kurs_ishi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<TextView>(R.id.login)
        var admin = findViewById<TextView>(R.id.admin)
        var sign = findViewById<Button>(R.id.button3)

        login.setOnClickListener {

            var instent = Intent(this,Login::class.java)
            val anim = AnimationUtils.loadAnimation(this, R.anim.anim)
            login.startAnimation(anim)
            startActivity(instent)

        }

        sign.setOnClickListener {

            val anim = AnimationUtils.loadAnimation(this, R.anim.anim)
            sign.startAnimation(anim)

        }


        admin.setOnClickListener {

            val anim2 = AnimationUtils.loadAnimation(this, R.anim.btn_anim)
            admin.startAnimation(anim2)
        }



    }
}