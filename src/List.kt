fun main (){
    // immutable list
    val num: List<Int> = listOf(1,2,3,4)
    println(num)
   // num[1]=3 // so here you cannot update the list
    println(num.lastIndexOf(4))// tell the index of number

    // mutable list
    val num1:MutableList<Int> = mutableListOf(10,20,30,40)
    num1.add(4,40)
    println(num1)
    num1.remove(30)
    println(num1)

}


