fun main(){
    val numList:List<Int> = listOf(10,11,12,13,14,15)
    val divisibleByFive:List<Int> =numList.filter{ it%5==0 }
    val oddNumList: List<Int> = numList.filter(::isOdd)
    val evenNumList:List<Int> =numList.filter(fun (a:Int):Boolean{
        return a%2==0
    })

    println(oddNumList)
    println(evenNumList)
    println(divisibleByFive)
}
fun  isOdd(a:Int):Boolean{
    return a%2!=0
}
