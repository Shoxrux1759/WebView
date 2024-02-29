package patterns

fun main() {

    val desktopBuilder: ComputerBuilder = DesktopComputerBuilder()

    val computerManufacturer = ComputerManufacturer(desktopBuilder)

    val desktopComputer: Computer = computerManufacturer.constructComputer()

    println(desktopComputer)
}
