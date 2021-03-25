fun main(){
    result(10,3,::multiplication)// pass function as parameter wow kotlin amazing
}
fun multiplication(first:Int,second:Int):Int{
    return first*second
}
fun result(firstOne:Int,secondOne: Int,fn:(Int,Int)->Int){
    val result=fn(firstOne,secondOne)
    print(result)

}