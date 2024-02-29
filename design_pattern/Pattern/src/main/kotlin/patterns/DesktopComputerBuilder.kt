package patterns

data class Computer(
    val CPU: String,
    val RAM: String,
    val storage: String,
    val GPU: String,
    val brand: String
)

interface ComputerBuilder {
    fun buildCPU(cpu: String): ComputerBuilder
    fun buildRAM(ram: String): ComputerBuilder
    fun buildStorage(storage: String): ComputerBuilder
    fun buildGPU(gpu: String): ComputerBuilder
    fun buildBrand(brand: String): ComputerBuilder
    fun build(): Computer
}

class DesktopComputerBuilder : ComputerBuilder {
    private var cpu = ""
    private var ram = ""
    private var storage = ""
    private var gpu = ""
    private var brand = ""

    override fun buildCPU(cpu: String): ComputerBuilder {
        this.cpu = cpu
        return this
    }

    override fun buildRAM(ram: String): ComputerBuilder {
        this.ram = ram
        return this
    }

    override fun buildStorage(storage: String): ComputerBuilder {
        this.storage = storage
        return this
    }

    override fun buildGPU(gpu: String): ComputerBuilder {
        this.gpu = gpu
        return this
    }

    override fun buildBrand(brand: String): ComputerBuilder {
        this.brand = brand
        return this
    }

    override fun build(): Computer {
        return Computer(cpu, ram, storage, gpu, brand)
    }
}

class ComputerManufacturer(private val computerBuilder: ComputerBuilder) {
    fun constructComputer(): Computer {
        return computerBuilder
            .buildCPU("Intel i7")
            .buildRAM("16GB")
            .buildStorage("1TB SSD")
            .buildGPU("NVIDIA GeForce RTX 3080")
            .buildBrand("Dell")
            .build()
    }
}
