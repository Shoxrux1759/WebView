package vazifa

import Models.UsersName
import java.util.Stack

fun main(args: Array<String>) {

    val users: Stack<UsersName> = Stack()

    var name = "Shoxrux"
    var surname = "Shodmonov"
    var name2 = "Raupov"
    var surname2 = "O`lmas"

    val user = UsersName(name, surname)
    val user2 = UsersName(name2, surname2)
    users.add(user)
    users.add(user2)

//    println(users)

//    println(users.pop())
//    println(users.empty())

//    println(users.size)

//    println(users.peek())
//
//    println(users.clear())
}
