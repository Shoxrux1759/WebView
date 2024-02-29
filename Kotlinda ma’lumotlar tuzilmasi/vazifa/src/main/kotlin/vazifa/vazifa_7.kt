package vazifa

import Models.Daraxt
import Models.Talaba
import kotlin.random.Random

fun main() {
    val talabalarIsmi = listOf("Ali", "Vali", "Hasan", "Husan", "Bekzod", "Sardor", "Shahzod", "Javohir", "Diyor")
    val daraxt = Daraxt()

    for (ism in talabalarIsmi) {
        val talaba = Talaba(ism, Random.nextInt(18, 25))
        daraxt.qosh(talaba)
    }

    daraxt.nazoratQil()
}
