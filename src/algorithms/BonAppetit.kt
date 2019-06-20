package algorithms

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    val unsharedItem = bill[k]
    val sharedItems = bill.sum() - unsharedItem
    val splitBillCost = sharedItems / 2
    if (splitBillCost == b) println("Bon Appetit")
    else println(b - splitBillCost)
}

fun main() {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
