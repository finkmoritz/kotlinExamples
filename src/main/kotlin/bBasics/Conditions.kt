package bBasics

fun main(args: Array<String>) {
    val x = 5
    val y = 3

    if(x > y) {
        println("x is bigger than y")
    } else {
        println("x is not bigger than y")
    }

    when(y) {
        5 -> println("y is 5")
        3 -> {
            println("y is not 5")
            println("y is 3")
        }
        else -> println("y is neither 3 nor 5")
    }
}