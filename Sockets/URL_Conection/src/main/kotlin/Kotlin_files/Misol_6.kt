package Kotlin_files

import Models.Lesson_6

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL



fun main() {

    println("Konsolga natija chiqadi faqat biroz kuting")

    val url = URL("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=8HHvBJTyvs7dMyCiGfI3vgHIMVGp4BmG")

    val openConnection = url.openConnection()

    val httpURLConnection = openConnection as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream

    val bufferedReader = inputStream.bufferedReader()

    val jsonString = bufferedReader.readText()

    val gson = Gson()

    val type = object : TypeToken<Lesson_6>(){}.type

    val obj : Lesson_6 = gson.fromJson(jsonString,type)

    obj.results?.forEach{i ->
        println(i)
    }


}