fun main() {
    print("Enter a number (1-7): ")
    val day = readLine()!!.toInt()

    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid input! Please enter a number between 1 and 7.")
    }
}
