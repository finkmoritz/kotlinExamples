package cClasses

fun main() {
    Mother().speak()
    Child().speak()
}

open class Mother {
    open fun speak() = println("I am mother")
}

class Child: Mother() {
    override fun speak() = println("I am child")
}