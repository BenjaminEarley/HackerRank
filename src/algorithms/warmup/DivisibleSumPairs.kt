package algorithms.warmup

import java.util.*

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    val pairs = mutableListOf<Pair<Int, Int>>()
    for (a in 0..n - 2) {
        for (b in a + 1 until n) {
            if ((ar[a] + ar[b]) % k == 0) pairs.add(Pair(ar[a], ar[b]))
        }
    }
    return pairs.size
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
