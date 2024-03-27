package uz.developer.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.developer.listview.databinding.ActivitySecondBinding
import uz.developer.listview.databinding.ActivitySecondEndBinding

class Second_EndActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondEndBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondEndBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("nomi")
        var tarkib = intent.getStringExtra("text")
        var mahsulot = intent.getStringExtra("tarkibi")

        binding.name.text = name
        binding.mahsulot.text = tarkib
        binding.text.text = mahsulot

    }
}