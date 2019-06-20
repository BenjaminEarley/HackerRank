package algorithms

import java.util.*


/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int =
    keyboards
        .crossJoinWith(drives)
        .map { it.first + it.second }
        .filter { b >= it }
        .let { if (it.isEmpty()) listOf(-1) else it }
        .reduce { acc, next -> if (next > acc) next else acc }


fun main() {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}

fun <T, S> Array<T>.crossJoinWith(other: Array<S>): List<Pair<T, S>> =
    flatMap { first -> other.map { second -> first to second } }

