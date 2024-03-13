package com.example.kotlinbasics
data class coffeefeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)
fun main() {
    println("Vælg dit første tal")
    val num1string = readln()
    val num1Int = num1string.toInt()
    println("Vælg dit andet tal")
    val num2string = readln()
    val num2int = num2string.toInt()
    print("Summen af dine tal er: ")
    var myResult = add(num1Int, num2int)
    println(myResult)
}


    fun add(num1: Int, num2: Int): Int {
        val result = num1 + num2
        return result
    }

    fun coffeefee() {
        println("Whatcha name?")
        var name = readln()
        println("How much sugar do want?")
        val sugarCounter = readln().toInt()
        makeCoffee(sugarCounter, name)
        //makeCoffee(sugarCount = 1, name = "Baltazar")
        //makeCoffee(sugarCount = 2, name = "Ragnhild")
        //makeCoffee(sugarCount = 0, name = "Snotte")
    }

    fun makeCoffee(sugarCount: Int, name: String) {
        if (sugarCount == 1) {
            println("Coffee with $sugarCount spoon of sugar for $name ")
        } else if (sugarCount > 1) {
            println("Coffee with $sugarCount spoons of sugar for $name")
        } else {
            println("Coffee with no sugar for $name")
        }
    }

