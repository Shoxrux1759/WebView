package patterns
fun main() {
    val highAccessImage: Image = ProxyImage("yuklanayotgan_rasm.jpg", 2)
    val lowAccessImage: Image = ProxyImage("past_resolution.jpg", 1)

    highAccessImage.display()
}
