class OuterClass {
    val hello = "Hello World"
    inner class InnerClass {
        fun hello() = hello
    }
}

fun main(args: Array<String>) {
    val hello = OuterClass().InnerClass().hello()
    println(hello)
}