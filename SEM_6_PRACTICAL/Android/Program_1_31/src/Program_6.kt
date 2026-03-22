fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number > 0) {
        println("$number is a Positive number")
    } else if (number < 0) {
        println("$number is a Negative number")
    } else {
        println("The number is Zero")
    }
}
