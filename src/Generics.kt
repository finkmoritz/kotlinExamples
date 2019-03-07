fun main(args: Array<String>) {
    //val integer = AnyNumber<Int>(42)
    val integer = AnyNumber(42) // compiler knows that the generic is <Int>
    val string = AnyNumber("Fourty-Two")
    println("AnyNumber=${integer.number}")
    println("AnyNumber=${string.number}")
}

class AnyNumber<T>(val number: T)