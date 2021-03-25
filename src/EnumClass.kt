fun  main(){
    val obj=Months.August
    println(obj)
    println(obj.monthNumber)
    obj.number()

}
enum class Months(val monthNumber:Int){
    January(1)
    ,February(2)
    ,March(3)
    ,April(4)
    ,May(5)
    ,Jun(6)
    ,July(7)
    ,August(8)
    ,September(9)
    ,October(10)
    ,November(11)
    ,December(12);
    fun number(){
        println("This is the month of $this")
    }
}