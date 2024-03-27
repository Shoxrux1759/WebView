package uz.developer.listview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.developer.listview.adapters.Myadapter
import uz.developer.listview.databinding.ActivityMainBinding
import uz.developer.listview.models.Programming

class MainActivity : AppCompatActivity() {
    private var list = ArrayList<Programming>()
    lateinit var adapter: Myadapter

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        loadInfo()

        adapter = Myadapter(list)
        binding.list.adapter = adapter

    }

    private fun loadInfo() {
        list.add(Programming(R.drawable.kotlin, "Kotlin"))
        list.add(Programming(R.drawable.java,"Java"))
        list.add(Programming(R.drawable.c_pluss,"C++"))
        list.add(Programming(R.drawable.php,"PHP"))
        list.add(Programming(R.drawable.python,"Python"))
        list.add(Programming(R.drawable.swift,"Swift"))
        list.add(Programming(R.drawable.scc,"scc"))
        list.add(Programming(R.drawable.kotlin, "Kotlin"))
        list.add(Programming(R.drawable.java,"Java"))
        list.add(Programming(R.drawable.c_pluss,"C++"))
        list.add(Programming(R.drawable.php,"PHP"))
        list.add(Programming(R.drawable.python,"Python"))
        list.add(Programming(R.drawable.swift,"Swift"))
        list.add(Programming(R.drawable.scc,"scc"))
    }



}

