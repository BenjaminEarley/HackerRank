package algorithms

import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxScore = scores.first()
    var maxScoreChangeCount = 0
    var minScore = scores.first()
    var minScoreChangeCount = 0

    scores.drop(1).forEach {
        if (it > maxScore) {
            maxScore = it
            maxScoreChangeCount += 1
        }
        if (it < minScore) {
            minScore = it
            minScoreChangeCount += 1
        }
    }

    return arrayOf(maxScoreChangeCount, minScoreChangeCount)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}