fun calculateResult() {
    print("Enter marks of Subject 1: ")
    val m1 = readLine()!!.toInt()

    print("Enter marks of Subject 2: ")
    val m2 = readLine()!!.toInt()

    print("Enter marks of Subject 3: ")
    val m3 = readLine()!!.toInt()

    val total = m1 + m2 + m3
    val percentage = total / 3.0

    println("Total Marks = $total")
    println("Percentage = $percentage")
}

fun main() {
    calculateResult()
}
