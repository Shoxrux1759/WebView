package Models

data class Doc(
    val `abstract`: String,
    val lead_paragraph: String,
    val multimedia: List<Multimedia>,
    val snippet: String,
    val source: String,
    val web_url: String
)