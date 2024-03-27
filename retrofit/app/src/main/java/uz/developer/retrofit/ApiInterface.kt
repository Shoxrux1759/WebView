package uz.developer.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.developer.retrofit.models.UserItem

interface ApiInterface {
    @GET("/users")
    fun getData() : Call<List<UserItem>>

}