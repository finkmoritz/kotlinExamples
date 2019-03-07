fun main(args: Array<String>) {
    val pair = IntStringPair(1, "One")
    val (myInteger, myString) = pair
    println("myInteger=$myInteger, myString=$myString")
}

data class IntStringPair(val x: Int, val s: String)