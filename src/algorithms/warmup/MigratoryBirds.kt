package algorithms.warmup

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int =
    arr
        .groupBy { it }
        .map { (key, value) -> Pair(key, value.size) }
        .reduce { (key1, size1), (key2, size2) ->
            if (size2 > size1 || key2 < key1 && size2 == size1) Pair(key2, size2)
            else Pair(key1, size1)
        }
        .first


fun main() {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
