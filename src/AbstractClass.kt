fun main(args: Array<String>){
    val obj:ParentS=ChiledS()
    obj.nonAbstractMethod()
    obj.parentMethod()
}
abstract class ParentS{
    abstract fun parentMethod()
    open fun nonAbstractMethod(){
        println("non abstract method")
    }
}
class ChiledS:ParentS(){
    override fun parentMethod() {
        println("abstract method is called")
    }

}