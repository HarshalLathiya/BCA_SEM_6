// Abstract base class
abstract class Shape {
    abstract fun area()
}

// Derived class
class Rectangle(
    private val length: Double,
    private val width: Double
) : Shape() {

    override fun area() {
        val result = length * width
        println("Area of Rectangle = $result")
    }
}

// Main function
fun main() {
    val rectangle = Rectangle(10.0, 5.0)
    rectangle.area()
}
