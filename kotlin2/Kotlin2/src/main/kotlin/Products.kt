import java.util.Date

class Products {

    var productName: String? = null
    var productPrice: Double? = null
    var productDescreoption: String? = null
    var createdAt: Date = Date()
    var update: Date? = null


    constructor(productName: String?, productPrice: String?, productDescreoption: String?, update: Date)

    override fun toString(): String {
        return "Products(productName=$productName, productPrice=$productPrice, productDescreoption=$productDescreoption, createdAt=$createdAt, update=$update)"
    }


}