package algorithms.warmup

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int =
    (0..s.size - m).filter { s.slice(it until it + m).sum() == d }.count()

fun main() {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}