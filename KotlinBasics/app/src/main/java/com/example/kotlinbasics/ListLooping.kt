package com.example.kotlinbasics

fun main(){
    val numbersList = mutableListOf(1,2,3,4,5)
    for (index in 0 until numbersList.size){
        numbersList[index] = numbersList[index] * 2
        println(numbersList[index])
    }
}
