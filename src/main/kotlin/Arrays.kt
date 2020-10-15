fun main(args: Array<String>) {
    val numbersArray: IntArray = intArrayOf(0,2,4)
    println("numbersArray[1]: "+numbersArray[1])

    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println("MutableList: "+numbers)
    numbers.add(4)
    println("MutableList plus 4: "+numbers)
    println("readOnlyView: "+readOnlyView)

    val items = listOf(1, 2, 3, 4)
    println("First Element of items: "+items.first())
    println("Last Element of items: "+items.last())
    println("Even Numbers of items: "+items.filter { it % 2 == 0 })

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println("readWriteMap[\"foo\"]: "+readWriteMap["foo"])

    val strings = hashSetOf("a", "b", "c", "c")
    println("hashSetOf: "+strings)
}