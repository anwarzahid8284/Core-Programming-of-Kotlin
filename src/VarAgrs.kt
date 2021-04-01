fun main(){
    arrayArg(10,11,22,13,14)

}
fun arrayArg(vararg values:Int){
    var sumValues=0
    for (index in values){
       sumValues +=index
    }
    println(sumValues)
}