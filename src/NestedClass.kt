fun main(){
    val obj=FirstClass.NestedClass()
    obj.nestedClassM()

}
class FirstClass{
    class NestedClass{
        fun nestedClassM(){
            println("This is method in nested class")
        }
    }
}