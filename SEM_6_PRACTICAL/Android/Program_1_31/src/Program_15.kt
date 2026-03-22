fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    var i = 1
    var factorial = 1

    while (i <= number) {
        factorial *= i
        i++
    }

    println("Factorial of $number = $factorial")
}
