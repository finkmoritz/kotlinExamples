fun main(args: Array<String>) {
    val superClass = SuperClass()
    superClass.publicVar
    //superClass.protectedVar // not allowed, because not called in a sub-class
    superClass.internalVar // allowed, because in same module/package
    //superClass.privateVar // not allowed, because not called inside the class
}

open class SuperClass {
    var publicVar = "publicVar"
    protected var protectedVar = "protectedVar"
    internal var internalVar = "internalVar"
    private var privateVar = "privateVar"
}

class ChildClass : SuperClass() {
    var x = publicVar
    var y = protectedVar
    var z = internalVar
    //var p = privateVar // not allowed, because not called inside SuperClass
}