package uz.developer.kurs_ishi.models

data class doc_info(
    val coment: String,
    val hospital: String,
    val id: String,
    val image: List<Image>,
    val name: String,
    val phone: String,
    val shahar: String,
    val shahar_tuman: String,
    val turi: String,
    val vil: String
)