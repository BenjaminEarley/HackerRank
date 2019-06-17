package algorithms.warmup

import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {

    val (positive, negative, zeros) = arr.fold(Triple(0.0, 0.0, 0.0)) { acc, number ->
        when {
            number > 0 -> acc.copy(first = acc.first + 1)
            number < 0 -> acc.copy(second = acc.second + 1)
            else -> acc.copy(third = acc.third + 1)
        }
    }

    println(positive / arr.size)
    println(negative / arr.size)
    println(zeros / arr.size)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}