package patterns

fun main() {
    val carpenterFactory: ArtisanFactory = CarpenterFactory()
    val blacksmithFactory: ArtisanFactory = BlacksmithFactory()

    val carpenter: Artisan = carpenterFactory.createArtisan()
    val blacksmith: Artisan = blacksmithFactory.createArtisan()

    println(carpenter.createCraft())
    println(blacksmith.createCraft())
}
