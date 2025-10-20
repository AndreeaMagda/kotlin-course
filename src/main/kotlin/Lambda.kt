package org.example

fun main() {
    println("Enter a string")
    val input = readln()

    val lettersOnly = input.myFilter { it.isLetter() }
    println(lettersOnly)
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if (predicate(char)) {
                append(char)
            }
        }
    }
}