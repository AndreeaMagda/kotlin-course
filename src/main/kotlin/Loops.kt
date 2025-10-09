package org.example

fun main(){
    println("Zi cate numere vrei:")
    val amountOfNumbers= readln().toIntOrNull() ?: 0
    var sum =0
    var i=0
    while(i<amountOfNumbers){
        println("Please enter the number #${i+1}")
        val number=readln().toIntOrNull() ?: continue
        sum+=number
        i++
    }
    println("The total is $sum")
}