fun  main(arrgs:Array<String>){
    val obj:A=B()
    obj.methodInterface()

}
interface A{
    fun methodInterface()

}
 class B:A{
     override fun methodInterface() {
         print("interface implement")
     }

}