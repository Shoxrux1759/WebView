import java.util.*
import kotlin.collections.ArrayList

class ProductInterfaceImplement : ProductInterface {

    var productsList = ArrayList<Products>()
    var scanner = Scanner(System.`in`)

    override fun addProduct() {
        println("Product name:")
        var productName = scanner.next()

        println("Product descreption:")
        var productDescreoption = scanner.next()

        println("Product price:")
        var productPrice = scanner.next()

        var product = Products(productName,productPrice,productDescreoption,Date())
        productsList.add(product)
        println("Malumot qo`shildi")
    }

    override fun listProduct() {
        for (products in productsList) {
            println(products)
        }

    }

    override fun updateProduct() {
        println("Update product name")
        val updateNewName = scanner.next()

        var index = -1;

        for (i in productsList.indices){
            if (updateNewName == productsList[i].productName){
                index = i
                break
            }
        }

        if (index == -1){
            println("Maxsulot topilmadi")
        }else{
            println("Product name:")
            var NewproductName = scanner.next()

            println("Product descreption:")
            var NewproductDescreoption = scanner.next()

            println("Product price:")
            var NewproductPrice = scanner.next()

            productsList[index].productName = NewproductName
            productsList[index].productDescreoption = NewproductDescreoption
            productsList[index].update = Date()
            println("Maxulot malumoti o`zgartirildi")
        }


    }
}