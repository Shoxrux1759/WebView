package uz.developer.listview

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import uz.developer.listview.databinding.ActivityPhoneCatalogBinding
import uz.developer.listview.models.addPhone_catalog

class PhoneCatalogActivity : AppCompatActivity() {

    lateinit var binding: ActivityPhoneCatalogBinding
    private lateinit var sharedPreferences: SharedPreferences

    var arrayList = ArrayList<addPhone_catalog>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val stringExtra = intent.getStringExtra("nomi")
        binding.save.setOnClickListener {
           var name =  binding.phoneName.text.toString()
           var struct =  binding.struct.text.toString()

            if (name == "" || struct == ""){
                Toast.makeText(this, "Ma`lumotni to`ldiring", Toast.LENGTH_SHORT).show()
            }
            else{
                arrayList.add(addPhone_catalog("phone",struct))
                if (stringExtra != null) {
                    saveData(stringExtra)
                }
                binding.phoneName.setText("")
                binding.struct.setText("")
            }

        }

    }
    private fun saveData(str:String) {
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(arrayList)
        editor.putString(str, json)
        editor.apply()
    }
}