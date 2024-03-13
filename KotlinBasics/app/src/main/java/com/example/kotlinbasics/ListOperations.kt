package com.example.kotlinbasics

fun main() {
    val fruitsList = mutableListOf("Banana", "Apple", "Pear", "Mango", "Kiwi")
    println(fruitsList)

    fruitsList.add("Orange")
    println(fruitsList)

    fruitsList.removeAt(0)
    println(fruitsList)

    if (fruitsList.contains("Mango")){
        println("SÅ ER DER MANGUSSY")
    }else{
        println("Årgh mand, ingen mangussy")
    }
}
