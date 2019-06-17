package algorithms.warmup

import java.util.*
import kotlin.text.*

// Complete the staircase function below.
fun staircase(n: Int) = (1..n).forEach { print("${" ".repeat(n - it)}${"#".repeat(it)}\n") }

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
