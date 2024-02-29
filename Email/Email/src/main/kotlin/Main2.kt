import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun main() {
    val props = Properties()
    props["mail.smtp.host"] = "smtp.gmail.com"
    props["mail.smtp.socketFactory.port"] = "465"
    props["mail.smtp.socketFactory.class"] = "javax.net.ssl.SSLSocketFactory"
    props["mail.smtp.auth"] = "true"
    props["mail.smtp.port"] = "465"

    val session = Session.getDefaultInstance(props,
        object : Authenticator() {
            override fun getPasswordAuthentication(): PasswordAuthentication {
                return PasswordAuthentication("shoxruxshodmonov022@gmail.com", "shoxrux_1759")
            }
        })
    try {
        val message = MimeMessage(session)
        message.setFrom(InternetAddress("shoxruxshodmonov022@gmail.com"))
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("zoom.pdp.888@gmail.com"))
        message.subject = "PDP online"
        message.setContent(
            "<img src=\"https://storage.kun.uz/source/thumbnails/_medium/6/Wlhgsmqd-PI1iTdyTUbSfSNIiTF9rNwE_medium.jpg\" width = \"50\" height = \"50\">",
            "text/html"
        )
        Transport.send(message)
        println("Send message!!!")
    } catch (e: Exception) {
        e.printStackTrace()
    }

}