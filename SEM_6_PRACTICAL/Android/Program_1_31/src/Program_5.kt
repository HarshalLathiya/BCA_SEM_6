fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number is an Even number")
    } else {
        println("$number is an Odd number")
    }
}
