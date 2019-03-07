fun main(args: Array<String>) {
    val numbersArray: IntArray = intArrayOf(0,2,4)
    println("Index 1 of numbers contains "+numbersArray[1])

    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println("my mutable list--"+numbers)
    numbers.add(4)
    println("my mutable list after addition --"+numbers)
    println(readOnlyView)


    val items = listOf(1, 2, 3, 4)
    println("First Element of our list----"+items.first())
    println("Last Element of our list----"+items.last())
    println("Even Numbers of our List----"+items.
        filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)
}