package dClassesAdvanced

fun main() {
    val pet = Pet("Dave","bird")

    println("Name=${pet.name}, Type=${pet.type}")
    println("toString()=$pet")
    println("hashCode()=${pet.hashCode()}")
}

data class Pet(val name: String, val type: String)