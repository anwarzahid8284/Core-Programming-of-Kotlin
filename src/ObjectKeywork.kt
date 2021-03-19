fun main(arrgs:Array<String>){
    println(ParentObject.xyz())
    println(ParentObject.a)
    var obj=object{
        fun zyx(){
            println("Object keyword expression")
        }
    }
    obj.zyx()

}
object ParentObject{
    var  a=8;
    fun xyz(){
        println("Keyword Object")
    }
}