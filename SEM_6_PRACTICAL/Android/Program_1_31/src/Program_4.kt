fun main() {
    print("Enter a year: ")
    val year = readLine()!!.toInt()

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        println("$year is a Leap Year")
    } else {
        println("$year is NOT a Leap Year")
    }
}
