package cClasses

fun main() {
    val example = Example()
    example.newFunction()
}

class Example {}

fun Example.newFunction() {
    println("New Function")
}