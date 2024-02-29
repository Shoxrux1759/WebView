import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

fun main() {
    val calendar = Calendar.getInstance()

    val tugilganKun = LocalDate.of(2002, 1, 27)
    val hozirgiKun = LocalDate.now()

    val farq = Period.between(tugilganKun, hozirgiKun)

    println("Tug'ilgan kun: $tugilganKun")
    println("Hozirgi kun: $hozirgiKun")
    println("Umumiy yil: ${farq.years}, umumiy kun: ${farq.days}")
}
