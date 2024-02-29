package Kotlin_files

import Models.Lesson_3
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL

fun main() {
        println("Konsolga natija chiqadi faqat biroz kuting")

        var url = URL("https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=8HHvBJTyvs7dMyCiGfI3vgHIMVGp4BmG")

        val httpURLConnection = url.openConnection() as HttpURLConnection

        httpURLConnection.connect()

        val inputStream = httpURLConnection.inputStream

        val buffered = inputStream.bufferedReader()

        val jsonString = buffered.readText()

        val type = object : TypeToken<Lesson_3>(){}.type

        val gson = Gson()

        val respons : Lesson_3 = gson.fromJson(jsonString,type)

        respons.results?.books?.forEach { i ->
                println(i)
        }
}