import java.time.Duration
import java.time.LocalDate

fun main() {
    var day1 = LocalDate.now()

    var day2 = LocalDate.of(2025,12,12)

    val numberOfDays = Duration.between(day1.atStartOfDay(),day2.atStartOfDay()).toDays()

    println("Resoult $numberOfDays day")
}