package com.example.kotlinbasics

fun main(){
    println("Indtast din alder")
    var age = readln().toInt()

    if(age in 18..39){
        println("Så er der snaps")
    }else if (age >= 40){
        println("Så er der sveskegrød")
    }else{
        print("Avafornåået")
    }
}