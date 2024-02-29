import Models.vazifa_1
import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    val users: Queue<vazifa_1> = LinkedList<vazifa_1>()

    // Create instances of vazifa_1 and add them to the queue
    val user1 = vazifa_1("Shoxrux", "+998907186705")
    val user2 = vazifa_1("O`lmas", "+998914563012")

    users.add(user1)
    users.add(user2)

    println(users)
    println("******************************")

//    users.element()
//    println(users)

//    println(users.peek())

//    println(users.poll())

//    println(users.size)
//
//    users.remove()
//    println(users)


    println(users)
}
