package patterns

interface Image {
    fun display()
}

class RealImage(private val filename: String) : Image {
    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Loading image: $filename")
    }

    override fun display() {
        println("Displaying image: $filename")
    }
}

class ProxyImage(private val filename: String, private val accessLevel: Int) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        if (accessLevel > 1) {
            realImage?.display() ?: run {
                realImage = RealImage(filename)
                realImage?.display()
            }
        } else {
            println("Ruxsat berilmadi. Sizda rasmni ko'rish uchun ruxsat yo'q.")
        }
    }
}


