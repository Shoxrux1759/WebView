package uz.developer.listview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.developer.listview.adapters.addPhone
import uz.developer.listview.databinding.ActivityAddPhoneBinding

class AddPhoneActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddPhoneBinding
    lateinit var adapter : addPhone
    var a = Four_Activity2()
    private val TAG = "list"
    var list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        var list = a.load()
//        Log.d(TAG, "list: $list")

        load()
        adapter  = addPhone(list)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener{ parent, view, position, id ->
            Log.d(TAG, "onCreate: $position", )
            var intent = Intent(this,PhoneCatalogActivity::class.java)
            //intent.putExtra("nomi",list[position].toString())
            startActivity(intent)
        }



    }

    private fun load() {
        list.add("iPhone")
        list.add("Samsung")
        list.add("Mi")
        list.add("Sony")
        list.add("Huawei")
        list.add("Artel")
    }

}