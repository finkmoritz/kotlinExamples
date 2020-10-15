fun main(args: Array<String>) {
    val a = 10000 // Implicit type = Int
    val d = 100.00 // Implicit type = Double
    val f = 100.00f // Implicit type = Float
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    val c = 'A' // Implicit type = Char
    val boo = true
    val str = "My String"

    println("Int Value is "+a)
    println("Double  Value is "+d)
    println("Float Value is "+f)
    println("Long Value is "+l)
    println("Short Value is "+s)
    println("Byte Value is "+b)

    println("Char Value is $c")
    println("Boolean Value is $boo")
    println("String Value is $str")
}