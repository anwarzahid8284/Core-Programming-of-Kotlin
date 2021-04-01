fun main(){
    val obj=OuterClass()
    val innerClass=obj.InnerClass()

    innerClass.innerClassM()
}
class OuterClass{
    inner class InnerClass{
        fun innerClassM(){
            println("inner class method")
        }
    }
}