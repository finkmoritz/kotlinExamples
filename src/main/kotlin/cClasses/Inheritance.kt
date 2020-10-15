package cClasses

fun main(args: Array<String>) {
    Mother().speak()
    Child().speak()
}

open class Mother {
    open fun speak() = println("I am mother")
}

class Child: Mother() {
    override fun speak() = println("I am child")
}