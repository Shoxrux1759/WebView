fun main() {
    val array = intArrayOf(64, 25, 12, 22, 11)

    println("Original array: ${array.joinToString(", ")}")

    quickSort(array, 0, array.size - 1)

    println("Sorted array: ${array.joinToString(", ")}")
}


fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val partitionIndex = partition(arr, low, high)

        quickSort(arr, low, partitionIndex - 1)
        quickSort(arr, partitionIndex + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1

    for (j in low until high) {
        if (arr[j] < pivot) {
            i++
            swap(arr, i, j)
        }
    }

    swap(arr, i + 1, high)

    return i + 1
}

fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

