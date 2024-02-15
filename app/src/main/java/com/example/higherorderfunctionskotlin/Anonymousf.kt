package com.example.higherorderfunctionskotlin

//fun without name- anonymous fun
fun main(){
    val add=fun(a:Int,b:Int):Int{return a+b}
    println(add(2,3))
    //with  parameters and return type
    val multiply=fun(a:Int,b:Int):Int {return a*b}
    println(multiply(4,5))
    //with parameters and no return type
    val add2=fun(a:Int,b:Int):Unit{ println(a+b) }
    add2(2,3)
    //no parameter and with return
    val add3=fun():String{return  "hello"}
    println(add3())
    //no parameter and no return
    val add4=fun():Unit{ println("no para no return") }
    println(add4())

}