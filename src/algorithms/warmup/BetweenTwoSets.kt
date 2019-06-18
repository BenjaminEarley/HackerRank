package algorithms.warmup

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int =
    lcm(a)
        .let { lcm -> generateSequence(lcm) { it + lcm } }
        .takeWhile { it <= b.last() }
        .filter { factor -> b.all { it % factor == 0 } }
        .count()


fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}

fun lcm(input: Array<Int>): Int {

    fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    fun lcm(a: Int, b: Int) = a * (b / gcd(a, b))

    var result = input[0]
    for (i in 1 until input.size) result = lcm(result, input[i])
    return result
}