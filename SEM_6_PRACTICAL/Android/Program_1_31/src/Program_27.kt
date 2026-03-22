// Base class
open class Person(
    var name: String,
    var age: Int
)

// Derived class 1
class Students(
    name: String,
    age: Int,
    var percentage: Double
) : Person(name, age) {

    fun displaystud() {
        println("Name        : $name")
        println("Age         : $age")
        println("Percentage  : $percentage")
    }
}

// Derived class 2
class Employee(
    name: String,
    age: Int,
    var salary: Double
) : Person(name, age) {

    fun displayemp() {
        println("Name   : $name")
        println("Age    : $age")
        println("Salary : $salary")
    }
}

// Main function
fun main() {
    val student = Students("Harshal", 21, 82.5)
    student.displaystud()

    println()

    val employee = Employee("mihir", 30, 45000.0)
    employee.displayemp()
}
