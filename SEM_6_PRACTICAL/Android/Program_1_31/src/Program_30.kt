// Parent class
open class Parent {

    open fun display() {
        println("This is display method of Parent class")
    }
}

// Child class
class Child : Parent() {

    override fun display() {
        super.display()
        println("This is display method of Child class")
    }
}

// Main function
fun main() {
    val obj = Child()
    obj.display()
}
