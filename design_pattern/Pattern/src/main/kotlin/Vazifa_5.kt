package patterns
fun main() {
    val carEngine = CarEngine()
    val carBody = CarBody()
    val carAccessories = CarAccessories()

    val carFacade = CarFacade(carEngine, carBody, carAccessories)

    carFacade.assembleCar()

    carFacade.disassembleCar()
}