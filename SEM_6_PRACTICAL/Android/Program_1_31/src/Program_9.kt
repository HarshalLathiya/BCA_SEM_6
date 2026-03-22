fun main() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    print("Enter third number: ")
    val c = readLine()!!.toInt()

    if (a > b) {
        if (a > c) {
            println("Maximum number is: $a")
        } else {
            println("Maximum number is: $c")
        }
    } else {
        if (b > c) {
            println("Maximum number is: $b")
        } else {
            println("Maximum number is: $c")
        }
    }
}
