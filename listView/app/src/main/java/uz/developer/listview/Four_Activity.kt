package uz.developer.listview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.developer.listview.databinding.ActivityFourBinding
import uz.developer.listview.databinding.ActivitySecondEndBinding

class Four_Activity : AppCompatActivity() {
    lateinit var binding: ActivityFourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener {

            val intent = Intent(this, AddPhoneActivity::class.java)
            startActivity(intent)
        }

        binding.show.setOnClickListener {
            val intent = Intent(this, Four_Activity2::class.java)
            startActivity(intent)
        }
    }
}
