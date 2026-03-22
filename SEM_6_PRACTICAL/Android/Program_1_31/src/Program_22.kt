fun printSquare(num: Int) {
    val square = num * num
    println("Square of $num = $square")
}

fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    printSquare(number)
}
