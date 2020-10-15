package eLambdas

fun main(args: Array<String>) {
    val myLambda : (String)->Unit = {s:String -> println("myLambda = $s")}
    printLambda("Hello World", myLambda)
}

fun printLambda(s: String, lambda: (String)->Unit) {
    lambda(s)
}