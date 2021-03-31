fun main(){
    val infoObj:Info=Info()
    infoObj.age=40
    infoObj.name="Knowledge foryou"
    println("value before apply function is $infoObj")
    infoObj.apply {
        age=50
        name="subscribe knowledge foryou"
    }
    println("value after apply function is $infoObj")
}
 data class Info(var name:String="",var age:Int=0)