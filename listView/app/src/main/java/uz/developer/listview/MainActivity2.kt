package uz.developer.listview

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.developer.listview.databinding.ActivityMain2Binding
import uz.developer.listview.models.OvqatData

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var ovqatList: ArrayList<OvqatData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // SharedPreferences dan ma'lumotni olish
        val sharedPreferences = getSharedPreferences("ovqat_info", MODE_PRIVATE)
        val json = sharedPreferences.getString("ovqat_list", "")

        if (json.isNullOrEmpty()) {
            Toast.makeText(this, "Keshda saqlangan ma'lumot mavjud emas", Toast.LENGTH_SHORT).show()
            ovqatList = ArrayList() // Bo'sh list yaratamiz
        } else {
            val gson = Gson()
            val type = object : TypeToken<ArrayList<OvqatData>>() {}.type
            ovqatList = gson.fromJson(json, type)
        }

        // OvqatData obyektlaridan 'nomi' qiymatlarni ajratib olish
        val nomiList = ovqatList.map { it.nomi }
        // ArrayAdapter ni 'nomiList' bilan tayyorlash
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomiList)

        // ListView ga adapter ni o'rnatish
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
                var intent = Intent(this,Second_EndActivity::class.java)
                intent.putExtra("nomi",ovqatList[position].nomi)
                intent.putExtra("tarkibi",ovqatList[position].tartib)
                intent.putExtra("text",ovqatList[position].mahsulot)
                startActivity(intent)
        }
    }
}

