package com.example.higherorderfunctionskotlin
//lambda expression is shorter way to create fun.
fun main(){

    //variable name-fun type-{lambda exp} ->structure of lambda exp
    /*
    * with parameters and no return value
    * with parameters and return value
    * no parameters and no return value
    * no parameters and return value
    * */

    //1. with parameters(Int,Int) and return type(Int)
    val add:(Int,Int)->Int={a,b->a+b}
    println(add(10,20))

    //2. with parameters and no return(unit-void) -just print
    val add2:(Int,Int)->Unit={ a,b-> println(a+b) }
    add2(20,30)

    //3. no parameters with return type
    val add3:()->String={ "Welcome to lambda" }
    println(add3())

    //4. no parameter and no return type
    val add4:()->Unit={ println("no return no parameter") }
    println(add4())
    add4.invoke()

    //direct use of lambda expressions
    println({a:Int,b:Int->a*b}(4,5))

}