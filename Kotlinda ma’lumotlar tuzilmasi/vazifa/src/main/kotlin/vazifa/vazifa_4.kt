package vazifa

import Models.Implament
import Models.Iterface
import java.util.Scanner

fun main() {

    var interfase = Implament()
    val scaner = Scanner(System.`in`)

    while (true){
        println("")
        println("1 -> Qarz daftaridagi malumotlarni ko`rish")
        println("2 -> Qarz daftarida ma`lumot qo`shish")
        println("3 -> Qarz daftaridagi barcha ma`lumotlarni o`chirish")
        println("")
        print("Tanlangan menu ni kiriting = ")
        var num = scaner.nextInt()

        when(num){
            1 -> interfase.show()

            2-> interfase.add()

            3-> interfase.allDelet()
        }
    }
}