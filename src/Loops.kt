fun main(args: Array<String>) {
    val primes = listOf(2,3,5,7,11)

    for(p in primes) {
        println("primes contains $p")
    }

    for((index,p) in primes.withIndex()) {
        println("primes[$index] = $p")
    }


    for(i in 1..5) {
        println("i=$i")
    }


    var x = 1
    while(x < 5) {
        println("x=$x")
        x++
    }

    x = 1
    do {
        println("x=$x")
        x++
    } while(x < 5)
}