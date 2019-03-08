fun main(args: Array<String>) {
    val nestedClass = CustomClass.NestedClass()
    val hello = nestedClass.hello()
    println(hello)
}

class CustomClass {
    class NestedClass {
        fun hello() = "Hello World"
    }
}