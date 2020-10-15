package dClassesAdvanced

fun main() {
    val cat = Animal.Cat("Kitty")
    val dog = Animal.Dog("Bello")

    println(cat.name)
    println(dog.name)
}

sealed class Animal {
    class Cat(val name: String)
    class Dog(val name: String)
}