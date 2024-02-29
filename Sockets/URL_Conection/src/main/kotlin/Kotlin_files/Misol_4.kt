package Kotlin_files

import Models.Lesson_4
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    println("Konsolga natija chiqadi faqat biroz kuting")

    val url = URL("https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=8HHvBJTyvs7dMyCiGfI3vgHIMVGp4BmG")

    val httpURLConnection = url.openConnection() as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream

    val buffered = inputStream.bufferedReader()

    val jsonString = buffered.readText()

    val type = object : TypeToken<Lesson_4>() {}.type

    val gson = Gson()

    val response: Lesson_4 = gson.fromJson(jsonString, type)

    response.results?.forEach { result ->
        println(result)
    }
}
