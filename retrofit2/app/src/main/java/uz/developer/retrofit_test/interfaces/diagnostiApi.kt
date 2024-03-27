package uz.developer.retrofit_test.interfaces

import retrofit2.http.POST
import uz.developer.retrofit_test.models.Answer
import retrofit2.Response

interface DiagnostiApi {
    @POST("diagnos_tur.php")
    suspend fun postQuotes(): Response<Answer>

}
