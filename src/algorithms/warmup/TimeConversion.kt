package algorithms.warmup

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val time = s.substring(0..s.length - 3)

    val meridianShift = s.slice(s.length - 2 until s.length).let { if (it == "PM") 12 else 0 }

    val (hour, minute, second) = time.split(':')

    val militaryHour = (if (hour == "12") meridianShift else hour.toInt() + meridianShift).toString().padStart(2, '0')

    return "$militaryHour:$minute:$second"
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}

