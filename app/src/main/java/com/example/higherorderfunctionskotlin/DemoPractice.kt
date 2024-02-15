package com.example.higherorderfunctionskotlin

fun main() {
    //a literal is a constant value assigned to a variable ex-10
    val x=10
    //when we assign a function to a variable it becomes a function literal
    //two type of fun literals 1. lambda expression 2.anonymous fun
    //lambda expression is shorter way to create function
    val printWelcome={ print("Welcome to world") }
    printWelcome()
}