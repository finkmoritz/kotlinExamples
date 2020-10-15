fun main(args: Array<String>) {
    val addLambda : (Int,Int)->Int = {x:Int,y:Int -> x+y}
    val printIntLambda : (Int)->Unit = {x:Int -> println("Integer = $x")}

    val x = 3
    val y = 4
    val result = addLambda(x,y)
    printIntLambda(result)
}