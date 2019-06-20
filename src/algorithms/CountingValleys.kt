package algorithms

import java.util.*
import kotlin.properties.Delegates

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var valleys = 0

    var elevation: Int by Delegates.observable(0) { _, old, new ->
        if (old == -1 && new == 0) valleys++
    }

    for (path in s) {
        when (path) {
            'U' -> elevation = elevation + 1
            'D' -> elevation = elevation - 1
        }
    }
    return valleys
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
