package com.example.homework1

//Task 8
class Person(val name: String, val age: Int, val gender: String)

//Task 9
fun Person.lifeStage(age: Int): String{
    return when (age){
        in 0..12 -> "Child"
        in 13..19 -> "Teen"
        else -> "Adult"
    }
}


fun main(){
    //task8
    val person = Person("Sarah", 24, "Female")
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Gender: ${person.gender}")
    println()

    //task9
    val lifeStage = person.lifeStage(person.age)
    println("Life Stage of ${person.name}: $lifeStage")
    println()

}



