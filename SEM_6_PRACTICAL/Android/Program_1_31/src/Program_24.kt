fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toInt()

    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    val result = multiply(num1, num2)
    println("Multiplication = $result")
}
