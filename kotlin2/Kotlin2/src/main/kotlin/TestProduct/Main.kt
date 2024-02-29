package TestProduct

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    var pro = ProductImplement()

    println("1-- Baza ko`rish")
    println("2-- Masulot qo`shish")
    println("3-- Maxsulotni o`zgartirish")
    var n = scanner.nextInt()
    while (true){
        when(n){
            1->{
                pro.show()
            }
            2->{
                pro.addProduct()
            }
            3->{
                pro.EditProduct()
            }
        }
    }
}