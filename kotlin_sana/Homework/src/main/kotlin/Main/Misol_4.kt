import files.Jamoa
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

var arrayList = ArrayList<Jamoa>()
var arrayList2 = ArrayList<Jamoa>()
var scanner = Scanner(System.`in`)

fun main() {
    team_building()
    turnir()

}

fun turnir() {
    var localDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm")
    val formattedDateTime = localDateTime.format(formatter)


    for (i in 0 until 8) {
        val a = i % 2
        if (a == 0) {
            val index = i
            val index2 = i + 1
            val addedTime = localDateTime.plusDays(2).plusHours(3)
            localDateTime = addedTime
            val formattedAddedTime = addedTime.format(formatter)
            println("${arrayList[index].jamoa_nomi} : ${arrayList[index2].jamoa_nomi}")
            println("Uchrashuv vaqti $formattedAddedTime")
        }
    }
}

fun team_building() {
    for (i in 0 until 8) {
        arrayList.add(Jamoa("${i + 1}-Jamoa"))
        //println(arrayList[i].jamoa_nomi)
    }
    //println(formattedDateTime)
}

