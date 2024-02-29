package patterns

fun main() {
    val circle = Circle()
    val square = Square()

    val composite = CompositeShape()
    composite.addShape(circle)
    composite.addShape(square)

    composite.draw()
}
