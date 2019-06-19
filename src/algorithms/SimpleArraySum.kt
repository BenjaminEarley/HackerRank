package algorithms

import java.util.*

/*
 * Complete the simpleArraySum function below.
 */
fun simpleArraySum(ar: Array<Int>): Int = ar.sum()

fun main() {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}