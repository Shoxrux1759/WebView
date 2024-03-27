package uz.developer.listview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.developer.listview.adapters.ThreePrograming
import uz.developer.listview.databinding.ActivityThiriBinding
import uz.developer.listview.models.GridModel

class ThiriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThiriBinding
    lateinit var adapter: ThreePrograming
    var list = ArrayList<GridModel>()
    private  val TAG = "Bingo"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThiriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadInfor()

        adapter = ThreePrograming(list)
        binding.gridView.adapter = adapter


        binding.gridView.setOnItemClickListener { parent, view, position, id ->
            var intent = Intent(this,ThriActivity2::class.java)
            intent.putExtra("image",list[position].image)
            intent.putExtra("name",list[position].name)
            intent.putExtra("text",list[position].text)
            startActivity(intent)
        }

    }

    private fun loadInfor() {
        list.add(GridModel(R.drawable.cupcake,"Cupcake","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk  sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk  sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk  sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk  sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk  "))
        list.add(GridModel(R.drawable.dune,"Dune","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk "))
        list.add(GridModel(R.drawable.eclair,"Eclair","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk "))
        list.add(GridModel(R.drawable.froya,"Froya","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk "))
        list.add(GridModel(R.drawable.kitkat,"Kitkat","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk "))
        list.add(GridModel(R.drawable.lolipop,"Lolipop","sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk sdfghjklkjhgfdsasdfghjklkjhgfdssdfghjk "))
    }
}


