import java.time.LocalDate
import java.time.Period
import javax.xml.crypto.Data

/* Hozirgi vaqtni chiqaring va shu yil yangi yilgacha necha kun borligini aniqlang.
*/
fun main() {

    var toDay = LocalDate.now()
    var NewYear = LocalDate.of(2023,12,31)

    var NewYear_Day = Period.between(toDay,NewYear)

    println("To day = $toDay")
    println("New year = $NewYear")
    println("The rest of the day = ${NewYear_Day.months} month and ${NewYear_Day.days} day")



}