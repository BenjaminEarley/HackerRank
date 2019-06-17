package algorithms.warmup

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {

    val length = s.length
    val time = s.substring(0..length - 3)
    val isPm = s.slice(length - 2 until length).let { it == "PM" }

    val (hour, rest) = time.split(':', limit = 2)

    val militaryHour = if (isPm) {
        if (hour == "12") "12" else (hour.toInt() + 12).toString()
    } else {
        if (hour == "12") "00" else hour
    }

    return "$militaryHour:$rest"
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}