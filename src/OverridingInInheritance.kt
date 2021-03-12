fun main(args:Array<String>){
    val childObj=ChiledClass("Hello Chiled")
    childObj.displayMessage()
    val parentObj=SuperClass("Hello Super")
    parentObj.displayMessage()

}
open class SuperClass(val type:String){
    open val  value:String=type
    open fun displayMessage(){
        println("$value class")
    }

}
class ChiledClass(param:String):SuperClass(param){
     override val value: String=param
    override fun displayMessage() {
        super.displayMessage()
        println("$value class")
    }

}