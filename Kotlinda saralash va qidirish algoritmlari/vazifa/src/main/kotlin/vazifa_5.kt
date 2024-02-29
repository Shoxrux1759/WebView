fun main() {
    val array = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)

    val target = 13
    val result = jumpSearch(array, target)

    if (result != -1) {
        println("$target elementi $result indeksda joylashgan")
    } else {
        println("$target elementi topilmadi")
    }
}

fun jumpSearch(arr: IntArray, x: Int): Int {
    val n = arr.size
    var step = Math.sqrt(n.toDouble()).toInt()

    var prev = 0

    while (arr[Math.min(step, n) - 1] < x) {
        prev = step
        step += Math.sqrt(n.toDouble()).toInt()
        if (prev >= n) {
            return -1
        }
    }

    for (i in prev until Math.min(step, n)) {
        if (arr[i] == x) {
            return i
        }
    }
    return -1
}