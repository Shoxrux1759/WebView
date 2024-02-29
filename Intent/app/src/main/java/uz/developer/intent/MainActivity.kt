package uz.developer.intent


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        var edit = findViewById<EditText>(R.id.edit_text)
        var anim = AnimationUtils.loadAnimation(this,R.anim.alphe)


        btn.setOnClickListener {

            btn.startAnimation(anim)

            var text = edit.getText().toString()

            if (text.isEmpty()){
                Toast.makeText(this, "Textni kiriting", Toast.LENGTH_SHORT).show()
            }
            else{

                var bundle = Bundle()
                bundle.putString("text",text)
                var intent = Intent(this,MainActivity2::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

                edit.setText("")
            }


        }


    }
}