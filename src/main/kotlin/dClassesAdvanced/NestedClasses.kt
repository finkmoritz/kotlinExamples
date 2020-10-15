package dClassesAdvanced

fun main() {
    val nestedClass = CustomClass.NestedClass()
    val hello = nestedClass.hello()
    println(hello)
}

class CustomClass {
    class NestedClass {
        fun hello() = "Hello World"
    }
}