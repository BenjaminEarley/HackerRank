package algorithms

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {

    val otherDays = 215

    val febDays = when {
        year < 1918 -> if (year % 4 == 0) 29 else 28
        year > 1918 -> if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 29 else 28
        else -> 15
    }

    val sepDay = 256 - (otherDays + febDays)


    return "$sepDay.09.$year"
}

fun main() {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}