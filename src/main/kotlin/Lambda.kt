package org.example

fun main() {
    println("Enter a string")
    val input = readln()

    val favoriteNumbers = intArrayOf(1, 52, 23, 43, 51)
    favoriteNumbers.map { it * it }

    val lettersOnly = input.myFilter {
        this.isLetter()
    }
    println(lettersOnly)
}

fun String.myFilter(predicate: Char.() -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if (char.predicate()) {
                append(char)
            }
        }
    }
}