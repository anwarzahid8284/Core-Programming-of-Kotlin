fun main(args:Array<String>){
    val obj=GetterSetter("Anwar Zahid",23)

    // getter value print
    println("Name:${obj.userName}  and   Age:${obj.userAge}")

    // set value
    obj.userName="Haroon"
    obj.userAge=-24
    println(obj.userName)
    println(obj.userAge)


}
class GetterSetter(name:String,age:Int){
    var userName:String=name
    get() {
        return field.toUpperCase()
    }
    var userAge:Int=age
    set(value) {
        if (value>0){
            field=value
        }else{
            field=0
        }
    }

}