fun main() {

    println("---- Arithmetic Operators ----")
    var a = 10
    var b = 3
    println("Value of A is : 10 \nValue of B is : 3\n")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")


    println("\n---- Relational Operators ----")
    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a >= b = ${a >= b}")
    println("a <= b = ${a <= b}")
    println("a == b = ${a == b}")
    println("a != b = ${a != b}")


    println("\n---- Logical Operators ----")
    val x = true
    val y = false

    println("x && y = ${x && y}")
    println("x || y = ${x || y}")
    println("!x = ${!x}")


    println("\n---- Assignment Operators ----")
    var c = 5
    println("c = $c")

    c += 2   // c = c + 2
    println("c += 2 → $c")

    c -= 1   // c = c - 1
    println("c -= 1 → $c")

    c *= 3   // c = c * 3
    println("c *= 3 → $c")

    c /= 2   // c = c / 2
    println("c /= 2 → $c")

    c %= 2   // c = c % 2
    println("c %= 2 → $c")


    println("\n---- Unary Operators ----")
    var n = 10
    println("n = $n")
    println("n++ = ${n++}")  // Post-increment
    println("After n++ → n = $n")
    println("++n = ${++n}")  // Pre-increment
    println("n-- = ${n--}")  // Post-decrement
    println("After n-- → n = $n")
}
