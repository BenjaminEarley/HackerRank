package algorithms.warmup

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> =
    a.zip(b).fold(arrayOf(0, 0)) { r, (a, b) ->
        if (a > b) r[0] += 1
        else if (b > a) r[1] += 1
        r
    }


fun main() {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}