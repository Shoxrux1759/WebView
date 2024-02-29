package TestProduct

import java.util.Date
import javax.xml.crypto.Data

class Products{

    var ProductName: String? = null
    var ProductPrice: String? = null
    var AddData: Date = Date()

    constructor(ProductName: String?, ProductPrice: String?) {
        this.ProductName = ProductName
        this.ProductPrice = ProductPrice
    }

    override fun toString(): String {
        return "Products(ProductName=$ProductName, ProductPrice=$ProductPrice, AddData=$AddData)"
    }


}