import java.net.HttpURLConnection
import java.net.URL
import javax.swing.text.html.HTML

//2-topshiriq
//
//https://api.github.com/users
//
//Quyidagi url orqali github userlar ma'lumotlarini o'qib oling va ekranga chiqaring.
fun main() {

    val url = URL("https://api.github.com/users")

    val openConnection = url.openConnection()

    val httpURLConnection = openConnection as HttpURLConnection

    httpURLConnection.connect()

    val inputStream = httpURLConnection.inputStream

    val bufferedReader = inputStream.bufferedReader()

    val list = bufferedReader.readLines()

    for (s in list) {
        println(s)
    }
}