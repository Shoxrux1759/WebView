import Models.Test
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://reqres.in/api/users?page=1")
    val httpURLConnection = url.openConnection() as HttpURLConnection

    try {
        httpURLConnection.connect()

        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()

        val jsonString = bufferedReader.readText()

        val gson = Gson()
        val type = object : TypeToken<Test>() {}.type

        try {
            val userResponse: Test = gson.fromJson(jsonString, type)

            for (user in userResponse.data) {
                println("id = ${user.id} Name = ${user.first_name}  Last_Name = ${user.last_name}  Email = ${user.email}  Avatar = ${user.avatar}")
            }
        } catch (e: JsonSyntaxException) {
            println("Error parsing JSON: ${e.message}")
        }
    } finally {
        httpURLConnection.disconnect()
    }
}
