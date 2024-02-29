package TestProduct

import java.util.Date
import java.util.Scanner

class ProductImplement : ProInterface {
    var scanner = Scanner(System.`in`)
    var productList = ArrayList<Products>()
    override fun show() {

        for (i in productList){
            println(i)
        }

    }


    override fun addProduct() {

        println("Product name")
        var proName = scanner.next()

        println("Product price")
        var proPrice = scanner.next()


        var pro = Products(proName, proPrice)

        productList.add(pro)

        println("Malumot qoshildi ☺☺")
    }

    override fun EditProduct() {
        var index = -1
        println("Qidirilayotgan tovar nomi")
        var productName = scanner.next()
        for (i in  productList.indices) {
            if (productList[i].ProductName == productName){
                index = i
                break
            }
        }

            if (index != -1){
                println("Maxsulot topilni malumotlarni o`zgartiring")
                println("Product name")
                var NewproductName = scanner.next()
                var Newproductprice = scanner.next()

                productList[index].ProductName = NewproductName
                productList[index].ProductPrice = Newproductprice
                productList[index].AddData = Date()

                println("Malumot muvofaqqiyatli o`zgartirildi")
            }

    }
}