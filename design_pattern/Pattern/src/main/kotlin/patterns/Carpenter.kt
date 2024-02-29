package patterns

interface Artisan {
    fun createCraft(): String
}

class Carpenter : Artisan {
    override fun createCraft(): String {
        return "Duradgor: Men yog'och mebel yarataman."
    }
}

class Blacksmith : Artisan {
    override fun createCraft(): String {
        return "Temirchi: Men metall buyumlarni yarataman."
    }
}

interface ArtisanFactory {
    fun createArtisan(): Artisan
}

class CarpenterFactory : ArtisanFactory {
    override fun createArtisan(): Artisan {
        return Carpenter()
    }
}

class BlacksmithFactory : ArtisanFactory {
    override fun createArtisan(): Artisan {
        return Blacksmith()
    }
}
