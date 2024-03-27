package uz.developer.kurs_ishi

import android.telecom.Call
import uz.developer.kurs_ishi.models.doc_info

interface docInfo_interface {

    fun getData(): Call<List<doc_info>>

}