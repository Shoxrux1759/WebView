package patterns

interface Shape {
    fun draw()
}

class Circle : Shape {
    override fun draw() {
        println("Doira chizish")
    }
}

class Square : Shape {
    override fun draw() {
        println("Kvadrat chizish")
    }
}
class CompositeShape : Shape {
    private val shapes: MutableList<Shape> = mutableListOf()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    override fun draw() {
        println("Kompozit shaklni chizish:")
        shapes.forEach { it.draw() }
    }
}
