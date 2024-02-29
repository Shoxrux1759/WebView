import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var productInterfaceImplement = ProductInterfaceImplement()

    while (true){
        println("1--> Maxsulot qoshish \n 2 --> Malumotni o`zgartirish \n 3-->Maxsulotlarni ko`rish")
        var n = scanner.nextInt()

        when(n){
            1-> {
                productInterfaceImplement.addProduct()
            }
            2->{
                productInterfaceImplement.updateProduct()
            }
            3->{
                productInterfaceImplement.listProduct()
            }
        }
    }
}