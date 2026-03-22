import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    println("----- Simple Calculator -----")

    print("Enter first number: ")
    val num1 = sc.nextDouble()

    print("Enter second number: ")
    val num2 = sc.nextDouble()

    println("\nChoose an operation:")
    println("1. Addition (+)")
    println("2. Subtraction (-)")
    println("3. Multiplication (*)")
    println("4. Division (/)")
    print("Enter your choice: ")
    val choice = sc.nextInt()

    when (choice) {
        1 -> println("Result: ${num1 + num2}")
        2 -> println("Result: ${num1 - num2}")
        3 -> println("Result: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0)
                println("Result: ${num1 / num2}")
            else
                println("Error: Cannot divide by zero!")
        }
        else -> println("Invalid choice!")
    }
}
