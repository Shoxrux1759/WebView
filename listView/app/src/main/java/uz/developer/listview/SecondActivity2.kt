package uz.developer.listview

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.developer.listview.databinding.ActivitySecond2Binding
import uz.developer.listview.models.OvqatData

class SecondActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySecond2Binding
    var arrayList = ArrayList<OvqatData>()
    private val sharedPrefFile = "ovqat_info"
    private lateinit var sharedPreferences: SharedPreferences
    private  val TAG = "SecondActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        loadData()

        binding.save.setOnClickListener {
            var name = binding.nomi.text.toString()
            var mahsulot = binding.mahsulot.text.toString()
            var text = binding.tartibi.text.toString()

            if (name.isEmpty() || mahsulot.isEmpty() || text.isEmpty()) {
                Toast.makeText(this, "Ma`lumotni to`liq kirting", Toast.LENGTH_SHORT).show()
            } else {
                arrayList.add(OvqatData(name, mahsulot, text))
                saveData()
                binding.nomi.setText("")
                binding.mahsulot.setText("")
                binding.tartibi.setText("")
            }
        }
    }

    private fun saveData() {
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(arrayList)
        editor.putString("ovqat_list", json)
        editor.apply()
    }

    private fun loadData() {
        val gson = Gson()
        val json = sharedPreferences.getString("ovqat_list", "")
        val type = object : TypeToken<ArrayList<OvqatData>>() {}.type
        arrayList = gson.fromJson(json, type) ?: ArrayList()
    }
}
