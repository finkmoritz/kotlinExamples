fun main(args: Array<String>) {
    val example = Example()
    example.newFunction()
}

class Example {

}

fun Example.newFunction() {
    println("New Function")
}