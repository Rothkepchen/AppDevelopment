package com.example.kotlinbasics

fun main() {
    //immutable list kan ikke tilføje ting til listen efter initialization
    val shoppingListi = listOf("Processor", "RAM", "GPU", "Harddisc")
    //mutable list kan godt tilføje ting til listen efter initialization
    val shoppingList = mutableListOf("Processor", "RAM", "GPU RTX 3060", "Harddisc")
    shoppingList.add("Cooler")
    shoppingList.remove("GPU RTX 3060")
    shoppingList.add("GPU RTX 4090")
    shoppingList.removeAt(1)
    shoppingList.add(2, "RAM")

    //Ændre index værdien i listen
    shoppingList[4] = "GPU RX 7800XT"
    //Dette kan også gøres på denne måde
    shoppingList.set(3, "Water Cooling")


    //Check for at se om en liste indeholder en sepcifik ting
    val hasRam = shoppingList.contains("RAM")
    if (hasRam){
        println("Der er RAM på listen")
    }else{
        println("Der er ingen RAM på listen")
    }

    for (index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at $index")
    }


    println(shoppingList)
}
