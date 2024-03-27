package uz.developer.listview

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.developer.listview.adapters.Phone_grid
import uz.developer.listview.adapters.addPhone
import uz.developer.listview.databinding.ActivityFour2Binding
import uz.developer.listview.databinding.ActivityFourBinding
import uz.developer.listview.models.OvqatData

open class Four_Activity2 : AppCompatActivity() {
    private  var  TAG = "tekshir"

    lateinit var binding: ActivityFour2Binding
    var list = ArrayList<String>()
    lateinit var adapter : Phone_grid
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFour2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        load()
        val i = intent.getStringExtra("name")
        Log.d(TAG, "Natija->: $i")
            show_btn()
    }


    private fun show_btn() {
        adapter = Phone_grid(getList()) // getList() orqali keshdagi malumotlarni olish
        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { parent, view, position, id ->
            var e = list[position]
            var intent = Intent(this,End_ListActivity::class.java)
            intent.putExtra("text",e)
            startActivity(intent)
        }
    }


    fun load() : List<String> {
        list.add("iPhone")
        list.add("Samsung")
        list.add("Mi")
        list.add("Sony")
        list.add("Huawei")
        list.add("Artel")

        return list
    }

    fun getList(): List<String> {
       // load()
        return list
    }
}