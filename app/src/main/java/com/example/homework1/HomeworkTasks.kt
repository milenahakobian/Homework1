package com.example.pss1tasks

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    // Task 1
    println("Task 1:")
    task1()
    println()

    // Task 2
    println("Task 2:")
    task2()
    println()

    // Task 3
    println("Task 3:")
    task3()
    println()

    // Task 4
    println("Task 4:")
    task4()
    println()

    // Task 5
    println("Task 5:")
    task5()
    println()

    // Task 6
    println("Task 6:")
    println(task6(9.0, 0.0))
    println()

    // Task 7
    println("Task 7:")
    task7()
    println()

    //Task 10
    println("Task 10:")
    task10()
}


// Task 1: Declare an array and a list of your choice, initialize them with values,
// and print the elements.
fun task1() {
    val array = arrayOf("Theory of Computing", "Optimization", "Machine Learning", "Data Structures")
    val list = listOf(1,1,2,3,5,8,13)
    println("Array: ${array.joinToString()}")
    println("List: ${list.joinToString()}")
}


// Task 2: Create a string variable and perform various string manipulations such as concatenation,
// substring extraction, and changing case, then print the modified string.
fun task2() {
    var str = "computer"
    println("Inital String: $str")
    str += " science"
    val substring = str.substring(8, 12)
    val uppercase = str.uppercase()
    println("Modified String: $str")
    println("Substring: $substring")
    println("Uppercase: $uppercase")
}

// Task 3: Declare a map with key-value pairs and iterate through it to print both keys and values.
fun task3() {
    val map = mapOf(252 to "ML", 219 to "Mobile Application Development", 222 to "DB Systems")
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }
}


// Task 4: Write a function that takes an integer as input and returns a string indicating whether
// it's positive, negative, or zero. Call this function with different integer inputs and print the results.
fun task4(){
    fun checkSign(number: Int):String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }
    val a = 5
    val b = -11
    val c = 0

    println("${a} is ${checkSign(a)}")
    println("${b} is ${checkSign(b)}")
    println("${c} is ${checkSign(c)}")
}



// Task 5: Create a program that asks the user for their name and age, then prints a personalized
// greeting with their name and a message based on their age.
fun task5() {
    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (age == null || age < 0) {
        println("Invalid age entered.")
    } else {
        when {
            age < 18 -> println("Hi, $name! You are underage.")
            else -> println("Hi, $name! You are an adult.")
        }
    }
}

// Task 6: Write a function that takes two numbers as input and divides them. Implement error
// handling to handle division by zero and print an appropriate message.
fun task6(a: Double, b: Double): Any {
    return try {
        if (b == 0.0) {
            "Division by zero is not allowed."
        } else {
            a / b
        }
    } catch (e: Exception) {
        "An error occurred: ${e.message}"
    }
}

// Task 7: Get the current date and time, format it, and print it.
@RequiresApi(Build.VERSION_CODES.O)
fun task7() {
    val cur = LocalDateTime.now()
    val formatted = cur.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
    println("Current Date and Time: $formatted")
}

//Task 10
fun task10() {
    val numbers = listOf(11, 2, 5, 82, 34, 1, 17, 0, 3, 10)

    // Use a lambda function to filter even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Even numbers in the list:")
    evenNumbers.forEach { println(it) }

}