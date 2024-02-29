import files.TV_Interface_Implement
import java.util.Scanner

/*TV dasturlar tizimini tashkil etadigan tizim yaratıng. Bir vaqt kiritilganda o'sha vaqtda qaysi tv dastur bo'layotganligini aniqlang.*/

fun main() {
    var scanner = Scanner(System.`in`)
    var tv = TV_Interface_Implement()

    while (true) {
        println("1-Malumot qo`shish")
        println("2 - Dasturlar katalogi")
        println("3 - Dasturni qidirish \n")

        var num = scanner.nextInt()

        when(num) {
            1 -> {
                tv.addTv()
            }
            2 -> {
                tv.showTv()
            }
            3 -> {
                tv.search()
            }
        }
    }
}
