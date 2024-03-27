package uz.developer.retrofit_test

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.developer.retrofit_test.models.Answer

object RetrofitHelper {
    val baseUrl = "https://includeitc.uz/Doc_base/files/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun postQuotes(list: List<Answer>): List<Answer> {


        return list
    }
}