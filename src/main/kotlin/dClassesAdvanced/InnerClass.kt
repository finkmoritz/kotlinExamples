package dClassesAdvanced

fun main(args: Array<String>) {
    val hello = OuterClass().InnerClass().hello()
    println(hello)
}

class OuterClass {
    val hello = "Hello World"
    inner class InnerClass {
        // Inner class can use val from outer class:
        fun hello() = hello
    }
}