package algorithms

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> =
    a.zip(b).fold(arrayOf(0, 0)) { acc, (a, b) ->
        if (a > b) acc[0] += 1
        else if (b > a) acc[1] += 1
        acc
    }


fun main() {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}