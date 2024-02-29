package Kotlin_files

import Models.Lesson_2
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL
import java.lang.reflect.Type


fun main() {
    println("Konsolga natija chiqadi faqat biroz kuting")

    var url = URL("https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&api-key=8HHvBJTyvs7dMyCiGfI3vgHIMVGp4BmG")

    val openConnection = url.openConnection()

    val httpURLConnection = openConnection as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream

    val gson = Gson()

    val bufferedReader = inputStream.bufferedReader()

    val jsonString = bufferedReader.readText()

    val type: Type = object : TypeToken<Lesson_2>() {}.type

    val response: Lesson_2 = gson.fromJson(jsonString, type)

    response.response?.docs?.forEach { doc ->
        println(doc)
    }
}
