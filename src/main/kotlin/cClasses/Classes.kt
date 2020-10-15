package cClasses

fun main() {
    val myClass = MyClass()
    myClass.print()
}

class MyClass {
    val myString = "Hello World"
    fun print() {
        println(myString)
    }
}