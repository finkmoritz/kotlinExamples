package gMisc

import java.util.Scanner

fun main(args: Array<String>) {
    val myScanner = Scanner(System.`in`)
    print("Enter your integer: ")
    val x = myScanner.nextInt()
    println("You entered the following integer: $x")
}