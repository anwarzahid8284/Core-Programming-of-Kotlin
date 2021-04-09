fun main(){
    val x: String? = readLine()
    val y:String?= readLine()
    val z:String?= readLine()
    val result=if(x?.toInt()!! > y?.toInt()!!){
        if(x?.toInt()!! > z?.toInt()!!){
            x
        }else{
            z
        }
    }else{
        if(y?.toInt()!! > z?.toInt()!!){
            y
        }else{
            z
        }
    }
    print("max =$result")

}