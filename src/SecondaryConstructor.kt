open class SecondaryConstructor {
    constructor(name:String){

    }
    constructor(name:String,age:Int){

    }
}
class SecondaryConstructorChild : SecondaryConstructor {
    constructor(name:String):this("knowledge foryou",12){
        println("name= $name")
    }
    constructor(name:String,age:Int):super(name, age){
        println("name= $name")
        println("age= $age")
    }
}
fun main(){
    val obj=SecondaryConstructorChild("Haroon",40)

}