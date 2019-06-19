package algorithms

import kotlin.math.absoluteValue


/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonal = 0
    var rightDiagonal = 0

    var rightDiagonalPosition = arr.size - 1

    arr.forEachIndexed { leftDiagonalPosition, row ->
        leftDiagonal += row[leftDiagonalPosition]
        rightDiagonal += row[rightDiagonalPosition]
        rightDiagonalPosition -= 1
    }

    return (leftDiagonal - rightDiagonal).absoluteValue
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}