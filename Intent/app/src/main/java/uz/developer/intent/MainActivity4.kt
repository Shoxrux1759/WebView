package uz.developer.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var l1 = findViewById<LinearLayout>(R.id.l1)
        var l2 = findViewById<LinearLayout>(R.id.l2)
        var l3 = findViewById<LinearLayout>(R.id.l3)
        var l4 = findViewById<LinearLayout>(R.id.l4)
        var l5 = findViewById<LinearLayout>(R.id.l5)

        var anText = findViewById<TextView>(R.id.an_text)
        var anText2 = findViewById<TextView>(R.id.an_text2)

        var kotText = findViewById<TextView>(R.id.kot_text)
        var kotText2 = findViewById<TextView>(R.id.kot_text2)

        var sqlText = findViewById<TextView>(R.id.kot_text)
        var sqlText2 = findViewById<TextView>(R.id.kot_text2)


        var phpText = findViewById<TextView>(R.id.ph_text)
        var phpText2 = findViewById<TextView>(R.id.ph_text2)

        var aeText = findViewById<TextView>(R.id.an_text)
        var aeText2 = findViewById<TextView>(R.id.an_text2)


        var intent = Intent(this,MainActivity4_2::class.java)

        l1.setOnClickListener {

            intent.putExtra("text", anText.text.toString())
            intent.putExtra("text2", anText2.text.toString())
            intent.putExtra("image", R.drawable.android)
            startActivity(intent)
        }
        l2.setOnClickListener {
            intent.putExtra("text", kotText.text.toString())
            intent.putExtra("text2", kotText2.text.toString())
            intent.putExtra("image", R.drawable.kotlin)
            startActivity(intent)
        }
        l3.setOnClickListener {
            intent.putExtra("text", sqlText.text.toString())
            intent.putExtra("text2", sqlText2.text.toString())
            intent.putExtra("image", R.drawable.sql)
            startActivity(intent)
        }
        l4.setOnClickListener {
            intent.putExtra("text", phpText.text.toString())
            intent.putExtra("text2", phpText2.text.toString())
            intent.putExtra("image", R.drawable.php)
            startActivity(intent)
        }
        l5.setOnClickListener {
            intent.putExtra("text", aeText.text.toString())
            intent.putExtra("text2", aeText2.text.toString())
            intent.putExtra("image", R.drawable.ae)
            startActivity(intent)
        }


    }

}