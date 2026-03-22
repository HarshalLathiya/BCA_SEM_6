fun main() {
    val cities = mapOf(
        1 to "Mumbai",
        2 to "Delhi",
        3 to "Chennai"
    )

    for ((key, value) in cities) {
        println("Key: $key, City: $value")
    }
}
