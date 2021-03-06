
    fun main(args:Array<String>){
        var arrayList= arrayListOf<Int>(10,12,13,14)
        arrayList.add(1,45)
        for(element in arrayList){
            println(element)
        }
        message()

    }
    fun message(count:Int=4){
        for(i in 1..count){
            println("Hello message $i")
        }
    }
