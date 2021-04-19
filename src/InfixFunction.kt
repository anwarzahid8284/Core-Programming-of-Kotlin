fun main(){
    val obj=InfixFunctionExample()
    obj.exampleInfix("Infix")
}
class InfixFunctionExample(){
    // infix function accept only single parameter type
    infix fun exampleInfix( str:String){
        println("this is the function name is $str")
    }
}