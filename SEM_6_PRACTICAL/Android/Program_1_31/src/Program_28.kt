import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

// Interface 1
interface MyDate {
    val date1: String
}

// Interface 2
interface MyTime {
    val time1: String
}

// Class implementing multiple inheritance using interfaces
class MyCalendar : MyDate, MyTime {

    override val date1: String
    override val time1: String

    init {
        val currentDate = LocalDate.now()
        val currentTime = LocalTime.now()

        val dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        val timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a")

        date1 = currentDate.format(dateFormat)
        time1 = currentTime.format(timeFormat)
    }

    fun display() {
        println("System Date : $date1")
        println("System Time : $time1")
    }
}

// Main function
fun main() {
    val calendar = MyCalendar()
    calendar.display()
}
