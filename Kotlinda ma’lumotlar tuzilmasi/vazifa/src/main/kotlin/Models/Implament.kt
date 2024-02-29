package Models

import java.util.Scanner
import java.util.Stack

class Implament : Iterface {

    val scaner = Scanner(System.`in`)
    var stek: Stack<Debtor> = Stack()


    override fun add() {
        print("Qarzdorning ismini kiriting = ")
        var uname = scaner.next()
        print("Qarzdorning qarz qiymatini kiritig = ")
        var uprice = scaner.next()
        val user = Debtor(uname, uprice)
        stek.add(user)
    }


    override fun show() {
        val empty = stek.isEmpty()
        if (empty == true){
            println("Qarz daftarida ma`lumot mavjud emas!!\n")
        }
        else{
            while (!stek.isEmpty()) {
                println(stek.pop())
            }
        }


    }

    override fun allDelet() {

        val empty = stek.isEmpty()

        if(empty == true){
            println("Qarz daftarida ma`lumot mavjud emas!!\n")
        }
        else{
            while (!stek.isEmpty()) {
                stek.clear()
            }
            println("Barcha ma`lumot o`chirildi\n")
        }

    }
}