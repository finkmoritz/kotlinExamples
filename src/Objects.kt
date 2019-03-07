fun main(args: Array<String>) {
    val star1 = Star()
    println("numberOfStars=${star1.numberOfStars()}")
    val star2 = Star()
    println("numberOfStars=${star1.numberOfStars()}")
    println("numberOfStars=${Star().numberOfStars()}")
}

class Star {
    companion object {
        var numberOfStars = 0
    }
    constructor() {
        numberOfStars++
    }
    fun numberOfStars() = numberOfStars
}