package cClasses

fun main(args: Array<String>) {
    val star1 = Star()
    println("numberOfStars=${star1.numberOfStars()}")
    val star2 = Star()
    println("numberOfStars=${star1.numberOfStars()}")
    println("numberOfStars=${Star().numberOfStars()}")
}

class Star {
    // companion object is the same for each instance of classes.Star
    companion object {
        var numberOfStars = 0
    }
    constructor() {
        // Increment count whenever a classes.Star instance is created:
        numberOfStars++
    }
    fun numberOfStars() = numberOfStars
}