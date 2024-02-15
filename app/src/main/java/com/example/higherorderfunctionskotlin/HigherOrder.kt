package com.example.higherorderfunctionskotlin
//it a function that takes  a function  as a parameter  or return  a function or both
fun main() {
    val add={a:Int,b:Int->a+b}
    hof(add)

    val numbers= listOf<Int>(1,2,3,4)
//    println(numbers.filter { numbers->numbers>3 })
   println(numbers.filter { it>3 })

}

fun hof(addition:(Int,Int)->Int){
    val result =addition(4,5)
    println(result)
}