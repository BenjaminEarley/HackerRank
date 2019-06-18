package algorithms.warmup

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int =
    s.toList().windowed(m).filter { it.sum() == d }.count()

fun main() {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}