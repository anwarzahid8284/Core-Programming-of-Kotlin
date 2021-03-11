
fun  main(args:Array<String>){
    val obj=LateInit()
    println(obj.add(4,5))
    println(obj.multiple(10,11))

}
class LateInit {
    lateinit var message:String
    fun add(a:Int,b:Int):Int{
        message="addition of $a and $b"
        println(message)
        return (a+b)
    }
    fun multiple(c:Int,d:Int):Int{
        message="multiplication of $c and $d"
        println(message)
        return (c*d)
    }
}