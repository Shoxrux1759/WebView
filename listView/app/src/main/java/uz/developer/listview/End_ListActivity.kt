package uz.developer.listview

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.developer.listview.adapters.addPhone
import uz.developer.listview.databinding.ActivityEndListBinding
import uz.developer.listview.models.addPhone_catalog

class End_ListActivity : AppCompatActivity() {

    lateinit var binding: ActivityEndListBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var list = ArrayList<addPhone_catalog>()
    lateinit var adapter: addPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val stringExtra = intent.getStringExtra("text")

        // SharedPreferences "phone" nomi bilan yaratilgan
        sharedPreferences = getSharedPreferences("phone", MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPreferences.getString(stringExtra, null)

        // JSON stringdan "addPhone_catalog" ArrayListini olish
        json?.let {
            list = gson.fromJson(
                it,
                object : TypeToken<ArrayList<addPhone_catalog>>() {}.type
            ) ?: ArrayList()
        }


        // Adapter yaratish
       // adapter = addPhone(list)
        binding.endList.adapter = adapter
    }
}
