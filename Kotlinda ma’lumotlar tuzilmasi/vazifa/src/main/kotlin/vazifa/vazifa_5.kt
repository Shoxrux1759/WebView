package vazifa

fun main() {
    val deque: ArrayDeque<String> = ArrayDeque()

    deque.add("1-ma`lumot")
    deque.add("2-ma`lumot")
    deque.add("3-ma`lumot")
    deque.add("4-ma`lumot")
    deque.add("5-ma`lumot")
    deque.add("6-ma`lumot")
    deque.add("7-ma`lumot")
    deque.add("8-ma`lumot")
    deque.add("9-ma`lumot")
    deque.add("10-ma`lumot")

//    println(deque.first())

//    println(deque.removeLast())

//    println(deque.removeFirst())

//    println(deque.size)

//    println(deque.last())

//    for (item in deque) {
//        println(item)
//    }


//    println(deque.isEmpty())

//    deque.removeLast()
//
    deque.removeFirst()
    for (item in deque) {
        println(item)
    }
}