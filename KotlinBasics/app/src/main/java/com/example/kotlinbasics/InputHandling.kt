package com.example.kotlinbasics

fun main(){
    val multiplier = 5
    println("please enter a number")
    var inputString = readln().toInt()
    println("Resultatet er: " + inputString * multiplier)
}