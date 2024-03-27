package uz.developer.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.developer.listview.databinding.ActivityThiriBinding
import uz.developer.listview.databinding.ActivityThri2Binding

class ThriActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityThri2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThri2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras != null) {
            val image = extras.getInt("image", 0) // 0 - agar ma'lumot topilmasa, qaytadangisi
            val name = extras.getString("name", "")
            val text = extras.getString("text", "")

            binding.name.text = name
            binding.info.text = text
            binding.image.setImageResource(image)

        }

    }
}