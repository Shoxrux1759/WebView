package uz.developer.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.developer.retrofit.Adapters.MyAdapter
import uz.developer.retrofit.databinding.ActivityMainBinding
import uz.developer.retrofit.models.UserItem

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

   lateinit var myAdapter : MyAdapter

    var Base_URL = "https://api.github.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.list.layoutManager = LinearLayoutManager(this)
        getData()

    }

    private fun getData() {

        var retrofit = Retrofit.Builder()
            .baseUrl(Base_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        var retrofitData = retrofit.getData()

        retrofitData.enqueue(object : Callback<List<UserItem>>{
            override fun onResponse(
                call: Call<List<UserItem>>,
                response: Response<List<UserItem>>
            ) {

                 var data = response.body()!!

                myAdapter = MyAdapter(baseContext,data)

                binding.list.adapter = myAdapter
            }

            override fun onFailure(call: Call<List<UserItem>>, t: Throwable) {

            }

        })
    }
}