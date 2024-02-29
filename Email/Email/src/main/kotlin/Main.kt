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
    props["mail.smtp.port"] = "587"


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
        message.subject = "Misol-1"
        message.setText("Misol-1")
        Transport.send(message)
        println("Send message!!!")
    } catch (e: Exception) {
        e.printStackTrace()
        println("Ishlamadi")
    }
}
