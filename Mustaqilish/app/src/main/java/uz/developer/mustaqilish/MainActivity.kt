package uz.developer.mustaqilish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var anim = AnimationUtils.loadAnimation(this, R.anim.translate)

        val btn = findViewById<Button>(R.id.btn)
        val login = findViewById<TextView>(R.id.login)

        var name = findViewById<TextInputEditText>(R.id.userName)
        var phone = findViewById<TextInputEditText>(R.id.userPhone)
        var password = findViewById<TextInputEditText>(R.id.userPassword)


        btn.setOnClickListener {

            btn.startAnimation(anim)
                var uname = name.getText().toString();
                var uphone = phone.getText().toString();
                var upassword = password.getText().toString();

                if (uname.isEmpty() || uphone.isEmpty() || upassword.isEmpty()) {
                    Toast.makeText(this, "Ma'lumotlarni to'ldiring!", Toast.LENGTH_SHORT).show()
                } else {

                    var intent = Intent(this, MainActivity3::class.java)



                    startActivity(intent)
                }

        }


        login.setOnClickListener {
            login.startAnimation(anim)
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
