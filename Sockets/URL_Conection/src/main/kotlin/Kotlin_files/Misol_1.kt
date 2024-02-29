import Models.Lesson_1
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    println("Konsolga natija chiqadi faqat biroz kuting")

    val gson = Gson()

    val apiKey = "xLphvfsdrNOfQBa86B4KxBFmSOYuPwi0"
    val url = URL("https://api.nytimes.com/svc/archive/v1/2019/1.json?api-key=$apiKey")
    val httpURLConnection = url.openConnection() as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream
    val bufferedReader = BufferedReader(InputStreamReader(inputStream))

    val jsonString = bufferedReader.readText()

    val type = object : TypeToken<Lesson_1>() {}.type

    val lessonResponse: Lesson_1 = gson.fromJson(jsonString, type)

    lessonResponse.response?.docs?.forEach { article ->
        println(article)
    }
}
