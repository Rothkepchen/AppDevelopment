package com.example.kotlinbasics

class Book (val title: String, val author: String, var yearPuplished: Int){
init{
    read(title)
}
    fun read(title: String){
        println("$title can be read")
    }
}