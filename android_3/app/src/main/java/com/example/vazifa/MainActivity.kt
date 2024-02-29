package com.example.vazifa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var random: Random
    lateinit var sav1: TextView
    lateinit var sav2: TextView
    lateinit var belgi: TextView
    lateinit var javob: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random = Random()
        sav1 = findViewById(R.id.savol1)
        sav2 = findViewById(R.id.savol3)
        belgi = findViewById(R.id.belgi)
        javob = findViewById(R.id.editText)


        val button = findViewById<Button>(R.id.yakun)
        val visib = findViewById<TextView>(R.id.visib)
        val teng = findViewById<TextView>(R.id.teng)
        val sent = findViewById<Button>(R.id.button)

       var y =  setNumbers()

        var t = 0;

        sent.setOnClickListener(View.OnClickListener {

            if (javob.toString() == y.toString()){
                Toast.makeText(this, "bingo", Toast.LENGTH_SHORT).show()
                javob.text.clear()
                t++
                setNumbers()

            }
            else{
                Toast.makeText(this, "noBingo", Toast.LENGTH_SHORT).show()
                javob.text.clear()
                setNumbers()
            }


        })

        button.setOnClickListener(View.OnClickListener {

            visib.text = "To`g`ri javoblar soni  $t"
            visib.visibility = View.VISIBLE
            belgi.visibility = View.GONE
            sav1.visibility = View.GONE
            sav2.visibility = View.GONE
            belgi.visibility = View.GONE
            javob.visibility = View.GONE
            button.visibility = View.GONE
            sent.visibility = View.GONE
            teng.visibility = View.GONE
        })

    }

    private fun setNumbers() {
        val savol1 = random.nextInt(100)
        val savol2 = random.nextInt(100)

        sav1.text = savol1.toString()
        sav2.text = savol2.toString()

        val result: Int
        val n = random.nextInt(4)

        when (n) {
            0 -> {
                belgi.text = "+"
                result = savol1 + savol2
            }
            1 -> {
                belgi.text = "-"
                result = savol1 - savol2
            }
            2 -> {
                belgi.text = "*"
                result = savol1 * savol2
            }
            3 -> {
                belgi.text = "/"
                result = savol1 / savol2
            }
            else -> {
                // Handle unexpected case
                result = 0
            }
        }
    }
}
