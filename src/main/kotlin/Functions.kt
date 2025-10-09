package org.example

fun main() {
    println("Enter a string ")
    val input = readln()

    val reversed = reversed(stringToReverse = input)

    if (input == reversed) {
        println("The nuber is palindrom")
    }
}


fun reversed(
    stringToReverse: String = "Smooth operator"
): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
    return finalString
}