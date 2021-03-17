fun main(args:Array<String>){
    val objP:ParetnsYZ=ParetnsYZ()
    val objC:ParentsXY=ParentsXY()
    objC.test()
}
open class ParetnsYZ{
    public var a:Int=9
    private var b:Int=10
    protected var c:Int=12
    internal var d:Int=13
}
class ParentsXY:ParetnsYZ(){
    fun test(){
        println(a)
        // this cannot be accessed outside from class println(b)
        println(c)
        println(d)
    }

}