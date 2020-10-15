fun main(args: Array<String>) {
    //val integer = AnyNumber<Int>(42) // Explicit generic declaration not necessary in this case
    val integer = AnyNumber(42) // Implicit generic <Int>
    val string = AnyNumber("Fourty-Two")
    println("AnyNumber=${integer.number}")
    println("AnyNumber=${string.number}")
}

class AnyNumber<T>(val number: T)