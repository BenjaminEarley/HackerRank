package algorithms

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>) {
    var min = Long.MAX_VALUE
    var max = Long.MIN_VALUE

    val array: Array<Long> = arr.map { it.toLong() }.toTypedArray()

    (0 until array.size).forEach {
        val sum = array.sum() - arr[it]
        if (sum < min) min = sum
        if (sum > max) max = sum
    }

    println("$min $max")
}

fun main() {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}