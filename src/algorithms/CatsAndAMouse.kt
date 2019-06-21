package algorithms

import java.util.*
import kotlin.math.abs

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val zToX = abs(z - x)
    val zToY = abs(z - y)

    return when {
        zToX < zToY -> "Cat A"
        zToX > zToY -> "Cat B"
        else -> "Mouse C"
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
