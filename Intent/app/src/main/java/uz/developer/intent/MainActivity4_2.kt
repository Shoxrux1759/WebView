package uz.developer.intent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity4_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main42)


        var text1 = findViewById<TextView>(R.id.info)
        var text2 = findViewById<TextView>(R.id.time)
        var image = findViewById<ImageView>(R.id.logo)


        val extras = intent.extras


        val text_1 = extras?.getString("text")
        val text_2 = extras?.getString("text2")
        val Image = extras?.getString("image")


        val imageResourceId = extras?.getInt("image")

        text1.text = text_1
        text2.text = text_2
        if (imageResourceId != null) {
            image.setImageResource(imageResourceId)
        }




    }
}