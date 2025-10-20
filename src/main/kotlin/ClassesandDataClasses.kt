package org.example

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 3f, height = 5f
    )
    Rectangle(
        width = 3f, height = 5f
    )
    rect1.copy(
        width = 10f,
    )

    val circle = Circle(radius = 25f)

    println(sumAreas(rect1, circle))

}

interface Shape {
    val area: Float
    val circumference: Float
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape -> currentShape.area.toDouble() }
}

data class Rectangle(
    val width: Float, val height: Float
) : Shape {
    val diagonal = sqrt(width * width + height * height)
    override val area = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circle(val radius: Float) : Shape {
    override val area = radius * radius * PI.toFloat()
    override val circumference = 2 * radius * PI.toFloat()
    val diameter = 2 * radius
}