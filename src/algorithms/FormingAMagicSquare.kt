package algorithms

import java.util.*
import kotlin.math.absoluteValue

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val imperfect = s.flatten()
    return perfectSquares
        .map { perfect ->
            perfect
                .zip(imperfect)
                .map { (it.first - it.second).absoluteValue }
                .sum()
        }
        .min()
        ?: -1
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = Array(3) { Array(3) { 0 } }

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}

val perfectSquares = arrayOf(
    arrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
    arrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4),
    arrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
    arrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
    arrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
    arrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
    arrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
    arrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8)
)

