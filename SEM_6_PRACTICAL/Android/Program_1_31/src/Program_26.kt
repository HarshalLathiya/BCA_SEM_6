// Base class
open class Person_1(
    var name: String,
    var age: Int
)

// Intermediate base class
open class Student(
    name: String,
    age: Int,
    var rollno: Int
) : Person_1(name, age)

// Derived class
class Result(
    name: String,
    age: Int,
    rollno: Int,
    var percentage: Double
) : Student(name, age, rollno) {

    fun display() {
        println("Roll No     : $rollno")
        println("Name        : $name")
        println("Age         : $age")
        println("Percentage  : $percentage")
    }
}

// Main function
fun main() {
    val result = Result("Harshal", 21, 5295, 80.0)
    result.display()
}
