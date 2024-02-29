import java.util.*
import javax.activation.DataHandler
import javax.activation.FileDataSource
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeMultipart
import javax.xml.crypto.Data

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
        var mimeBodyPart = MimeBodyPart()
        mimeBodyPart.setText("Bu rasmli fayl")
        val mimeMultipart = MimeMultipart()
        mimeMultipart.addBodyPart(mimeBodyPart)

        mimeBodyPart = MimeBodyPart()
        var file = "Shox_icon.jpg"
        val fileDataSource = FileDataSource(file)
        mimeBodyPart.dataHandler = DataHandler(fileDataSource)
        mimeBodyPart.fileName = file
        mimeMultipart.addBodyPart(mimeBodyPart)

        val message = MimeMessage(session)
        message.setFrom(InternetAddress("shoxruxshodmonov022@gmail.com"))
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("zoom.pdp.888@gmail.com"))
        message.subject = "PDP online"
        message.setContent(mimeMultipart)
        Transport.send(message)
        println("Send message!!!")
    } catch (e: Exception) {
        e.printStackTrace()
    }

}