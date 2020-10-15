package eLambdas

fun main() {
    val myLambda : (String)->Unit = {s:String -> println("myLambda = $s")}
    printLambda("Hello World", myLambda)
}

fun printLambda(s: String, lambda: (String)->Unit) {
    lambda(s)
}