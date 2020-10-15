package bBasics

fun main(args: Array<String>) {
    for (j in 1..4)
        println("j=$j")

    val i = 3
    if (i in 1..5) {
        println("$i is in range")
    }
}