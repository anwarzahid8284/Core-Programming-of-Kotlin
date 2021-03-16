fun main(args: Array<String>) {
    // reference of parent class but object of child
    //  class which hold the method of child classes
    val chiledy: ParentX = ChiledY(4, 5)
    val chiledz: ParentX = ChiledZ(10, 10)
    println(chiledy.calculation())
    println(chiledz.calculation())
}

open class ParentX {
    open fun calculation(): Int {
        return 0;
    }
}

class ChiledY(var a: Int, var b: Int) : ParentX() {
    override fun calculation(): Int {
        return a + b
    }

}

class ChiledZ(var x: Int, var z: Int) : ParentX() {
    override fun calculation(): Int {
        return x * z
    }

}