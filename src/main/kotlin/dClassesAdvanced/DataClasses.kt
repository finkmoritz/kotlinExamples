package dClassesAdvanced

fun main(args: Array<String>) {
    val pet = Pet("Dave","bird")

    println("Name=${pet.name}, Type=${pet.type}")
    println("toString()=$pet")
    println("hashCode()=${pet.hashCode()}")
}

data class Pet(val name: String, val type: String)