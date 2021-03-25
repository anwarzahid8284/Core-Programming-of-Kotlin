fun main(){
    val obj:DataKeyword=DataKeyword("Knowledge foryou",12)
    println(obj)
    println(obj.copy())
    val boj1=obj.copy(name = "Subscribe knowledge foryou")
    println(boj1.age)

}
data class DataKeyword(val name:String,val age:Int){

}