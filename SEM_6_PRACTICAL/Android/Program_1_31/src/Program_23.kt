fun getCube(): Int {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    return num * num * num
}

fun main() {
    val cube = getCube()
    println("Cube = $cube")
}
