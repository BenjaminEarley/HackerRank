package algorithms

import java.util.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {

    val midPoint = n / 2 + 1

    return if (p == 1) 0
    else if (p < midPoint) p / 2
    else if (n % 2 == 0 && p % 2 == 1) (n - p) / 2 + 1
    else (n - p) / 2
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
