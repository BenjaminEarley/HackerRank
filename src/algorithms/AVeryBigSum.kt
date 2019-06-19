package algorithms

import java.util.*

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long = ar.sum()


fun main() {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}