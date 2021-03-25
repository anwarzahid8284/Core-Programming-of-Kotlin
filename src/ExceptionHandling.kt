import java.lang.IllegalArgumentException

fun main(){
    val value= arrayOf(5,6,7,0)
    manualException(10)
    manualException(-10)

    try {
        println(value[7])
    }catch (e:Exception){
        println(e.message)
    }finally {
        println("This finally in both case to be run exception throw are not.")
    }
}
fun manualException(count:Int){
    if(count<-1){
        throw IllegalArgumentException("count must be greater than 0")
    }
}