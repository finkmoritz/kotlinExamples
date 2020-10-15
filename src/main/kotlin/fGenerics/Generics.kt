package fGenerics

fun main() {
    //val integer = fGenerics.AnyNumber<Int>(42) // Explicit generic declaration not necessary in this case
    val integer = AnyNumber(42) // Implicit generic <Int>
    val string = AnyNumber("Fourty-Two")
    println("fGenerics.AnyNumber=${integer.number}")
    println("fGenerics.AnyNumber=${string.number}")
}

class AnyNumber<T>(val number: T)