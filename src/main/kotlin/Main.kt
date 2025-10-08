package org.example

fun main() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger= input.toIntOrNull()

    val output=when(inputAsInteger){
        null ->"Dude enter a valid numbe!"
        3->"The number is three"
        5->"The number is five"
        in 4..20 -> "The number is between 10 and 20"
        else -> "I have no ideea what to print"
    }
    println(output)
}