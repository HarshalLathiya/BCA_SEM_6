fun main() {
    var i = 1
    var sum = 0

    while (i <= 10) {
        if (i % 2 == 0) {
            sum += i
        }
        i++
    }

    println("Sum of even numbers between 1 and 10 = $sum")
}
