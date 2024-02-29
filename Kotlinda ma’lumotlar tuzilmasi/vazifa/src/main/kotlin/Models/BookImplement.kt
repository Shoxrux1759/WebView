package Models

import java.util.Scanner
import java.util.ArrayDeque


class BookImplement : Book {

    private val scanner = Scanner(System.`in`)
    private val drama: ArrayDeque<BookName> = ArrayDeque()
    private val fantastic: ArrayDeque<BookName> = ArrayDeque()
    private val detective: ArrayDeque<BookName> = ArrayDeque()
    private val historical: ArrayDeque<BookName> = ArrayDeque()
    private val poetry: ArrayDeque<BookName> = ArrayDeque()

    override fun addBook() {
        print("Javonga nechta kitob qo`shib qoymoqchisiz = ")
        val num = scanner.nextInt()

        if (num <= 0) {
            println("Ma`lumot xato kiritildi qayta urinib ko`ring")
            return
        }

        repeat(num) {
            println("Janrni tanlang")
            println("1 - Dramma")
            println("2 - Fantastik")
            println("3 - Detiktiv")
            println("4 - Tarixiy")
            println("5 - Sherlar va poeziya")

            val choice = scanner.nextInt()

            print("Kitob nomini kiriting = ")
            val bookName = scanner.next()
            val book = BookName(when (choice) {
                1 -> "Dramma"
                2 -> "Fantastik"
                3 -> "Detiktiv"
                4 -> "Tarixiy"
                5 -> "Sherlar va poeziya"
                else -> ""
            }, bookName)

            when (choice) {
                1 -> drama.add(book)
                2 -> fantastic.add(book)
                3 -> detective.add(book)
                4 -> historical.add(book)
                5 -> poetry.add(book)
            }
        }
    }

    override fun showBook() {
        val d = drama.isEmpty()
        val f = fantastic.isEmpty()
        val d3 = detective.isEmpty()
        val h = historical.isEmpty()
        val p = poetry.isEmpty()

        if (d == true &&  f == true &&  d3 == true &&  h == true &&  p == true){
            println("Javonda kitob mavjud emas!!!\n")
        }
        else{
            printGenre("Dramma", drama)
            printGenre("Fantastik", fantastic)
            printGenre("Detiktiv", detective)
            printGenre("Tarixiy", historical)
            printGenre("Sherlar va poeziya", poetry)
        }

    }

    private fun printGenre(genre: String, deque: ArrayDeque<BookName>) {
        println("$genre Kitoblari:")
        for (book in deque) {
            println(book)
        }
        println()
    }
}
