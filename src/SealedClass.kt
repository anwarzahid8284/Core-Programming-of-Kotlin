fun main(){
    val obj=ChiledSealed_A("Knowledge foryou",5)
    println("Hia sealedA ${obj.name}")

    val obj1:ParentSealed=ChiledSealed_B("subscribe",6)
    val objectsResult=when(obj1){
        is ChiledSealed_A ->obj1.age*7
        is ChiledSealed_B ->obj1.age*8
    }
    println(objectsResult)
}
sealed class ParentSealed
class ChiledSealed_A(val name:String,val age:Int):ParentSealed()
class ChiledSealed_B(val name: String,val age: Int):ParentSealed()
