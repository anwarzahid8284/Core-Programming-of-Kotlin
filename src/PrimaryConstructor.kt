class PrimaryConstructor (val name:String,val age:Int) {
}
class PrimaryConstructorWithInit(name: String,ages: Int){
    var firstName:String
    var age:Int
    init {
        firstName=name.capitalize()
        age=ages
        println("name =$firstName")
        println("age =$age")
    }
}
fun main(){
    val obj=PrimaryConstructor("Haroon",40)
    val obj1=PrimaryConstructorWithInit("Knowledge foryou",100)
    println("name =${obj.name}")
    println("age =${obj.age}")
}