package gMisc

import java.lang.Exception

fun main(args: Array<String>) {
    try {
        val x = 1/0
    } catch (e:Exception) {
        e.printStackTrace()
    } finally {
        println("Reached finally block")
    }
}