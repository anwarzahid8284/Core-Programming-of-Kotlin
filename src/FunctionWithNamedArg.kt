fun main(){
    nameArg("Muhammad",6)
    nameArg("Muhammad")
    nameArg(age = 30)
    nameArg()
}
fun  nameArg( name:String="Default Name",age:Int=0){
    println("name is $name and age is $age")
}