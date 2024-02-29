package files

import java.util.Scanner

class TV_Interface_Implement : TV_InterfaceL {
   var scanner = Scanner(System.`in`)
    var arrayList = ArrayList<TV_Adapter>()

    override fun addTv() {
        println("Kanal nomini kiriting")
        var kanal_nomi = scanner.next()

        println("Dastur nomini kiriting")
        var dastur_nomi = scanner.next()

        println("Dastur kunini kiriting")
        var dastur_kuni = scanner.next()

        println("Dastur vaqtini kiriting")
        var dastur_vaqti = scanner.next()

        var add = TV_Adapter(kanal_nomi, dastur_nomi, dastur_kuni, dastur_vaqti.toString())
        arrayList.add(add)
        println("Malumot qo`shildi")
    }

    override fun showTv() {
        var index = -1
        for (tvAdapter in arrayList) {
            println(tvAdapter)
            index++
        }

        if (index == -1){
            println("Malumot mavjud emas\n")
        }
    }

    override fun search() {

        println("Dastur vaqtini kiriting")
        var dastur_vaqti = scanner.next()

        var index = -1

        for (i in arrayList.indices) {
            if (arrayList[i].dastur_vaqti.toString() == dastur_vaqti){
                println("Dastur nomi: ${arrayList[i].dastur_nomi}")
                println("Dastur vaqti: ${arrayList[i].dastur_vaqti}")
                index ++
            }
        }
        if (index == -1) {
            println("Malumot topilmadi\n")

        }


    }
}