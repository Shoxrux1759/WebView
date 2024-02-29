package Models
import Models.Users
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL
class MyThread: Thread{

    override fun run() {
        val url = URL("https://jsonplaceholder.typicode.com/users")

        val openConnection = url.openConnection()

        val httpURLConnection = openConnection as HttpURLConnection

        val inputStream = httpURLConnection.inputStream

        val buffered = inputStream.bufferedReader()

        val stringJson = buffered.readText()

        val gson = Gson()

        val type = object : TypeToken<Users>(){}.type

        val fromJson : Users= gson.fromJson<Users>(stringJson, type)

        for (person in fromJson) {
            println(person)
        }
    }
}