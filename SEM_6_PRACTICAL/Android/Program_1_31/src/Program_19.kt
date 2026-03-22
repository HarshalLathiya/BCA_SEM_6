fun main() {
    val numbers = mutableSetOf<Int>()

    // Adding elements to the set
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    numbers.add(20)   // Duplicate value (will not be added)

    for (num in numbers) {
        println(num)
    }
}
