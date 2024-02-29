package uz.developer.intent

import java.io.Serializable

class Contact: Serializable {
    var name : String? = null
    var contactNumbers : String? = null

    constructor(name: String?, contactNumbers: String?) {
        this.name = name
        this.contactNumbers = contactNumbers
    }
}