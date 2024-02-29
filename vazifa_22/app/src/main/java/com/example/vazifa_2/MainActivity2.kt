package com.example.vazifa_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity2 : AppCompatActivity() {

    lateinit var random: Random
    lateinit var savol: TextView
    lateinit var yakun: TextView
    lateinit var natija: TextView
    lateinit var group: RadioGroup
    lateinit var btn: Button

    var correctAnswer: Int = 0
    var i: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        random = Random()
        group = findViewById(R.id.radioGroup)
        btn = findViewById(R.id.sent)
        savol = findViewById(R.id.savol)
        yakun = findViewById(R.id.yakun)
        natija = findViewById(R.id.natija)
        val result = quations()
        correctAnswer = question(result)

        btn.setOnClickListener(View.OnClickListener {
            val checkedId = group.checkedRadioButtonId

            if (checkedId != -1) {
                val selectedAnswerIndex = when (checkedId) {
                    R.id.radio1 -> 1
                    R.id.radio2 -> 2
                    R.id.radio3 -> 3
                    R.id.radio4 -> 4
                    else -> 0  // Default value for safety
                }

                if (selectedAnswerIndex == correctAnswer) {
                    Toast.makeText(this@MainActivity2, "To`g'ri", Toast.LENGTH_SHORT).show()
                    i++
                } else {
                    Toast.makeText(this@MainActivity2, "Xato", Toast.LENGTH_SHORT).show()
                }

                quations()
                val newResult = quations()
                correctAnswer = question(newResult)
                group.clearCheck()
            } else {
                Toast.makeText(this@MainActivity2, "Iltimos, javob tanlang", Toast.LENGTH_SHORT).show()
            }
        })


        yakun.setOnClickListener(View.OnClickListener {


            natija.text = "Tog`ri topilgan javoblar soni $i  ta"
            group.visibility = View.GONE
            btn.visibility = View.GONE
            savol.visibility = View.GONE
            natija.visibility = View.VISIBLE
        })
    }

    private fun question(g: Int): Int {
        val jav1 = findViewById<RadioButton>(R.id.radio1)
        val jav2 = findViewById<RadioButton>(R.id.radio2)
        val jav3 = findViewById<RadioButton>(R.id.radio3)
        val jav4 = findViewById<RadioButton>(R.id.radio4)

        var b = random.nextInt(99)
        var c = random.nextInt(99)
        var d = random.nextInt(99)
        var run = random.nextInt(4)
        var t = 0
        when (run) {
            0 -> {
                jav1.text = g.toString()
                jav2.text = b.toString()
                jav3.text = c.toString()
                jav4.text = d.toString()
                t = 1
            }
            1 -> {
                jav1.text = b.toString()
                jav2.text = g.toString()
                jav3.text = c.toString()
                jav4.text = d.toString()
                t = 2
            }
            2 -> {
                jav1.text = b.toString()
                jav2.text = c.toString()
                jav3.text = g.toString()
                jav4.text = d.toString()
                t = 3
            }
            3 -> {
                jav1.text = b.toString()
                jav2.text = c.toString()
                jav3.text = d.toString()
                jav4.text = g.toString()
                t = 4
            }
        }
        return t
    }

    private fun quations(): Int {
        var n = random.nextInt(2)
        var sum = 0
        var a = random.nextInt(99)
        var a2 = random.nextInt(99)
        when (n) {
            0 -> {
                var sav = "$a + $a2"
                savol.text = sav
                sum = a + a2
            }
            1 -> {
                if (a > a2) {
                    var sav = "$a - $a2"
                    savol.text = sav
                    sum = a - a2
                } else {
                    var sav = "$a2 - $a"
                    savol.text = sav
                    sum = a2 - a
                }
            }
        }
        return sum
    }
}
