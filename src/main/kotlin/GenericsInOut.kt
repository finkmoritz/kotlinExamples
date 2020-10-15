fun main(args: Array<String>) {

}

interface Inbound<in T> {
    fun setT(x: T)
    //fun getT() : T forbidden by 'in'
}

interface Outbound<out T> {
    //fun setT(x:T) forbidden by 'out'
    fun getT() : T
}