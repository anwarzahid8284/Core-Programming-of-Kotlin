fun main(args:Array<String>){
    val parentObj=Parent()
    val chiledAObj=ChiledA()
    val chiledBObj=ChiledB();

    chiledAObj.parentMethod()
    chiledAObj.chiledA()

    chiledBObj.parentMethod()
    chiledBObj.chiledB()

    parentObj.parentMethod()





}
open class Parent {
    init {
        println("first Parent constructor called")
    }
    fun parentMethod(){
        println("Its parent method called")
    }
}
class ChiledA:Parent(){
    init {
        println("chiled A constructor called")
    }
    fun chiledA(){
        println("its chiled A method called")
    }

}
class ChiledB:Parent(){
    init {
        println("its chiled B constructor called")
    }
    fun chiledB(){
        println("its Chiled B method called")
    }

}