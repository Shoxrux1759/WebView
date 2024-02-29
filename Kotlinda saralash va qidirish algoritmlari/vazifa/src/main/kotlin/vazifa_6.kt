fun main() {
    val array = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)

    val target = 11
    val result = fibonacciSearch(array, target)

    if (result != -1) {
        println("$target elementi $result indeksda joylashgan")
    } else {
        println("$target elementi topilmadi")
    }
}

fun fibonacciSearch(arr: IntArray, x: Int): Int {
    val n = arr.size
    var fibMm2 = 0
    var fibMm1 = 1
    var fib = fibMm2 + fibMm1

    while (fib < n) {
        fibMm2 = fibMm1
        fibMm1 = fib
        fib = fibMm2 + fibMm1
    }

    var offset = -1

    while (fib > 1) {
        val i = Math.min(offset + fibMm2, n - 1)

        if (arr[i] < x) {
            fib = fibMm1
            fibMm1 = fibMm2
            fibMm2 = fib - fibMm1
            offset = i
        } else if (arr[i] > x) {
            fib = fibMm2
            fibMm1 -= fibMm2
            fibMm2 = fib - fibMm1
        } else {
            return i
        }
    }

    if (fibMm1 == 1 && arr[offset + 1] == x) {
        return offset + 1
    }

    return -1
}
