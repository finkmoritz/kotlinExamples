fun main(args: Array<String>) {
    val x = 3
    val xSquared = squared(x)
    val xCubed = cubed(x)
    println("$x*$x=$xSquared")
    println("$x*$x*$x=$xCubed")
}

fun squared(x: Int): Int {
    return x*x
}

fun cubed(x: Int) : Int = x*x*x