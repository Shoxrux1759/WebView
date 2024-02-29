package patterns

class CarFacade(
    private val carEngine: CarEngine,
    private val carBody: CarBody,
    private val carAccessories: CarAccessories
) {
    fun assembleCar() {
        println("Mashinani yig'ish ...")
        carBody.build()
        carBody.paint()
        carEngine.start()
        carAccessories.installMusicSystem()
        carAccessories.installAirConditioner()
        println("Avtomobilni yig'ish tugallandi")
    }

    fun disassembleCar() {
        println("Avtomobilni qismlarga ajratish ...")
        carEngine.stop()
        println("Avtomobilni demontaj qilish tugallandi..")
    }
}
