fun main() {
    val array = intArrayOf(12, 11, 13, 5, 6, 7)

    println("Boshlang'ich massiv: ${array.joinToString()}")

    heapSort(array)

    println("Sortirovka qililgan massiv: ${array.joinToString()}")
}

fun heapSort(arr: IntArray) {
    val n = arr.size

    for (i in n / 2 - 1 downTo 0) {
        heapify(arr, n, i)
    }

    for (i in n - 1 downTo 1) {
        val temp = arr[0]
        arr[0] = arr[i]
        arr[i] = temp

        heapify(arr, i, 0)
    }
}

fun heapify(arr: IntArray, n: Int, i: Int) {
    var largest = i

    val leftChild = 2 * i + 1
    val rightChild = 2 * i + 2

    if (leftChild < n && arr[leftChild] > arr[largest]) {
        largest = leftChild
    }

    if (rightChild < n && arr[rightChild] > arr[largest]) {
        largest = rightChild
    }

    if (largest != i) {
        val swap = arr[i]
        arr[i] = arr[largest]
        arr[largest] = swap

        heapify(arr, n, largest)
    }
}
