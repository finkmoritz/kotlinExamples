package gMisc

import java.lang.Exception

fun main() {
    try {
        val x = 1/0
    } catch (e:Exception) {
        e.printStackTrace()
    } finally {
        println("Reached finally block")
    }
}