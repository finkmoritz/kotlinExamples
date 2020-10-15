package cClasses

fun main() {
    val ab = AB()
    ab.funA()
    ab.funB()
    println("a=${ab.a}, b=${ab.b}")
}

interface A {
    val a: Int
    fun funA() = println("funA")
}

interface B {
    val b: Int
    fun funB()
}

class AB : A, B {
    override val a = 1
    override val b = 2
    override fun funB() = println("funB")
}