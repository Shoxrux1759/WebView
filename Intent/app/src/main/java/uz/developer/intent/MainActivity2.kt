package uz.developer.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textView = findViewById<TextView>(R.id.tv)

        val extras  = intent.extras

        val exrrass = intent.extras

        val string = extras?.getString("text")

        val second = exrrass?.getString("text2")


        textView.text = second

        textView.text = string

    }
}