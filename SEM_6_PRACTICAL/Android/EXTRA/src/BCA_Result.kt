import kotlin.math.round

data class Subject(
    val name: String,
    val credit: Int,
    val internalMax: Int,
    val internalObt: Int,
    val externalMax: Int,
    val externalObt: Int
) {
    val totalMax: Int get() = internalMax + externalMax
    val totalObt: Int get() = internalObt + externalObt
    val percentage: Double get() = (totalObt.toDouble() / totalMax) * 100
}

fun calculateGrade(percentage: Double): String {
    return when {
        percentage >= 96 -> "O"
        percentage >= 86 -> "A+"
        percentage >= 76 -> "A"
        percentage >= 66 -> "B+"
        percentage >= 56 -> "B"
        percentage >= 46 -> "C"
        percentage >= 36 -> "P"
        else -> "F"
    }
}

fun gradePoint(grade: String): Int {
    return when (grade) {
        "O" -> 10
        "A+" -> 9
        "A" -> 8
        "B+" -> 7
        "B" -> 6
        "C" -> 5
        "P" -> 4
        else -> 0
    }
}

fun calculateSGPA(subjects: List<Subject>): Double {
    var totalCredits = 0
    var totalGP = 0.0

    for (s in subjects) {
        val g = calculateGrade(s.percentage)
        val gp = gradePoint(g)

        totalCredits += s.credit
        totalGP += s.credit * gp
    }

    return if (totalCredits > 0) totalGP / totalCredits else 0.0
}

fun main() {

    print("Enter number of subjects: ")
    val n = readLine()!!.toInt()

    val subjects = mutableListOf<Subject>()

    for (i in 1..n) {
        println("\nEnter details of Subject $i")

        print("Subject name: ")
        val name = readLine()!!

        print("Credit: ")
        val credit = readLine()!!.toInt()

        print("Internal max marks: ")
        val internalMax = readLine()!!.toInt()

        print("Internal obtained marks: ")
        val internalObt = readLine()!!.toInt()

        print("External max marks: ")
        val externalMax = readLine()!!.toInt()

        print("External obtained marks: ")
        val externalObt = readLine()!!.toInt()

        subjects.add(
            Subject(
                name,
                credit,
                internalMax,
                internalObt,
                externalMax,
                externalObt
            )
        )
    }

    println("\n\n============== STUDENT RESULT ==============")

    println(
        String.format(
            "%-15s %-6s %-12s %-12s %-12s %-12s %-10s %-8s",
            "Subject", "Cred", "Internal", "External", "Total", "Max", "%", "Grade"
        )
    )
    println("-------------------------------------------------------------------------------")

    for (s in subjects) {
        val grade = calculateGrade(s.percentage)
        println(
            String.format(
                "%-15s %-6d %-12s %-12s %-12d %-12d %-10.2f %-8s",
                s.name,
                s.credit,
                "${s.internalObt}/${s.internalMax}",
                "${s.externalObt}/${s.externalMax}",
                s.totalObt,
                s.totalMax,
                s.percentage,
                grade
            )
        )
    }

    println("-------------------------------------------------------------------------------")

    val sgpa = calculateSGPA(subjects)
    println("SGPA: %.2f".format(sgpa))
}
