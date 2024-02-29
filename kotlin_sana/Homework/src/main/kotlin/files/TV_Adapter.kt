package files

import java.time.LocalTime
import java.time.format.DateTimeFormatter

open class TV_Adapter {
    var kanal_nomi: String? = null
    var dastur_nomi: String? = null
    var dastur_kuni: String? = null
    var dastur_vaqti: LocalTime? = null

    constructor(kanal_nomi: String?, dastur_nomi: String?, dastur_kuni: String?, dastur_vaqti: LocalTime?) {
        this.kanal_nomi = kanal_nomi
        this.dastur_nomi = dastur_nomi
        this.dastur_kuni = dastur_kuni
        this.dastur_vaqti = dastur_vaqti
    }

    constructor(kanal_nomi: String?, dastur_nomi: String?, dastur_kuni: String?, dastur_vaqti: String) {
        this.kanal_nomi = kanal_nomi
        this.dastur_nomi = dastur_nomi
        this.dastur_kuni = dastur_kuni
        this.dastur_vaqti = parseTimeString(dastur_vaqti)
    }

    private fun parseTimeString(timeString: String): LocalTime {
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        return LocalTime.parse(timeString, formatter)
    }

    override fun toString(): String {
        return "TV_Adapter(kanal_nomi=$kanal_nomi, dastur_nomi=$dastur_nomi, dastur_kuni=$dastur_kuni, dastur_vaqti=$dastur_vaqti)"
    }


}
