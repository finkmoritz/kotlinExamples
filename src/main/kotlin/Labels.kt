fun main(args: Array<String>) {
    outerLabel@ for(i in 1..3) {
        innerLabel@ for(j in 1..3) {
            println("(i,j)=($i,$j)")
            if(j == 3) {
                continue@outerLabel
            } else if(j == 2) {
                break@innerLabel
            }
        }
    }
}