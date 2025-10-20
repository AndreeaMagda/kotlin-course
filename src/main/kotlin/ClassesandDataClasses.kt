package org.example

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 3f,
        height = 5f
    )
    val rect2 = Rectangle(
        width = 3f,
        height = 5f
    )
    val rect3= rect1.copy(
        width = 10f,
    )

    val circle = Circle(radius = 25f)

    println(circle.area)
    println(rect3)
    println(rect1==rect2)

}

data class Rectangle(val width: Float, val height: Float) {
    val diagonal = sqrt(width * width + height * height)
    val area = width * height
}

data class Circle(val radius: Float) {
    val area = radius * radius*PI
    val diameter= 2* radius
}