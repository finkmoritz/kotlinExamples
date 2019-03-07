fun main(args: Array<String>) {
    val primaryCar = Car("Ferrari")
    println("My primary car is a ${primaryCar.color} ${primaryCar.brand}")

    val secondaryCar = Car("BMW", "blue")
    println("My primary car is a ${secondaryCar.color} ${secondaryCar.brand}")
}


class Car(val brand: String) {
    var color = "red"
    constructor(brand: String, color: String):this(brand) {
        this.color = color
    }
}