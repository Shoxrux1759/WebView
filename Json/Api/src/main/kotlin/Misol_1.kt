import Models.Sum
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL


fun main() {

    val url = URL("http://cbu.uz/uzc/arkhiv-kursov-valyut/json/")

    val openConnection = url.openConnection()

    val httpURLConnection = openConnection as HttpURLConnection

    val inputStream = httpURLConnection.inputStream

    val bufferedReader = inputStream.bufferedReader()

    val jsonString = bufferedReader.readText()

    val gson = Gson()
    val type = object : TypeToken<List<Sum>>() {}.type

    val testList: List<Sum> = gson.fromJson(jsonString, type)

    for (currency in testList) {
        if (currency.CcyNm_UZ == "AQSH dollari"){
            println("1 ${currency.CcyNm_UZ} =  10300 so'm")
        }
    }
}