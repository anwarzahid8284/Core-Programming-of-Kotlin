fun main(){
    val result=::sum //function assign to variable (first method)
    val result1: (first: Int, second: Int) -> Int=::sum //function assign to variable (second method)
    print(result(5,6))

}
fun  sum(first:Int,second:Int):Int{
    return first+second;
}