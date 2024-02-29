package uz.developer.intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var editText = findViewById<EditText>(R.id.username)
        var phone = findViewById<EditText>(R.id.userPhone)
        var btn = findViewById<Button>(R.id.btn1)




        btn.setOnClickListener {
            val toString = editText.text.toString()

            val toString1 = phone.text.toString()

            if (toString.isEmpty() || toString1.isEmpty()) {
                Toast.makeText(this, "Malumotni to`liq kiting", Toast.LENGTH_SHORT).show()
            } else {



                val contact = Contact(toString, toString1)

                var bundle = Bundle()


                bundle.putSerializable("userInfo", contact)

                var intent = Intent(this, MainActivity4::class.java)

                intent.putExtras(bundle)

                startActivity(intent)

            }

        }


    }
}