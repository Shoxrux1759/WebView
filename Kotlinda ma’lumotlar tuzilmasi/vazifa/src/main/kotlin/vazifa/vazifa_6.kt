package vazifa

import Models.BookImplement
import java.util.Scanner

fun main() {

    var scaner = Scanner(System.`in`)
    val book = BookImplement()
    while (true){
        println("1 - kitob javonidagi kitoblar ro`yxatini ko`rish")
        println("2 - kitob javoniga kitoblar qo`shish")
        println("")
        print("Menudagi bo`limlardan birini tanlang = ")
        val num = scaner.nextInt()
        when(num){

            1 ->book.showBook()

            2 ->book.addBook()

        }
    }

}