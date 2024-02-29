package Kotlin_files

import Kotlin_files.Lesson_5

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    println("Konsolga natija chiqadi faqat biroz kuting")

    val url = URL("https://api.nytimes.com/svc/news/v3/content/section-list.json?api-key=8HHvBJTyvs7dMyCiGfI3vgHIMVGp4BmG")

    val openConnection = url.openConnection()

    val httpURLConnection = openConnection as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream

    val bufferedReader = inputStream.bufferedReader()

    val gson = Gson()

    val jsonString = bufferedReader.readText()

    val type = object : TypeToken<Lesson_5>() {}.type

    val resolut: Lesson_5 = gson.fromJson(jsonString, type)

    resolut.results?.forEach { result ->
        println(result)
    }
}
