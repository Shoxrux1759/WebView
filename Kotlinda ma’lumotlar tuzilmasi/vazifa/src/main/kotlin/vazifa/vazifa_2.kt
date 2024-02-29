package vazifa

import Models.Doctor
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val registration: Queue<Doctor> = LinkedList<Doctor>()


    print("Nechta foydalanuvchini kiritmoqchisiz = ")
    var regis_userSize = scanner.nextInt()
    var i = 1;
    if(regis_userSize > 0 ){
            repeat(regis_userSize) {
                print("$i - bemorning registratsiya sanasi: ")
                var registrationData = scanner.next()
                print("$i - bemorning Fish ni kiriting: ")
                var name = scanner.next()

                print("$i - bemorning telefon raqamini kiriting: ")
                var phone = scanner.next()

                val user = Doctor(registrationData, name, phone)
                registration.add(user)
                i++;
                println("***************")
            }

            println(registration)
    }
    else{
        println("Qiynat xato kiritildi qayta urinib ko`ring!!")
    }
}
