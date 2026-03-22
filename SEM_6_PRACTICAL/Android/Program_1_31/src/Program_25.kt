// Base class
open class Div(
        var name: String,
        var age: Int
        )

// Derived class
        class Stud(
        name: String,
        age: Int,
        var rollno: Int
        ) : Div(name, age) {

        fun display() {
        println("Roll No : $rollno")
        println("Name    : $name")
        println("Age     : $age")
        }
        }

// Main function
        fun main() {
        val student = Stud("Harshal", 21, 5295)
        student.display()
        }
