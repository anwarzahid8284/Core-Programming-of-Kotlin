fun  main(){
    val userObj:User=User()
    userObj.name="Knowledge foryou"
    userObj.age=40
    println("Before all function $userObj")
    val x=userObj.let {
        it.name="Knowledge foryou (let)"
        it.age=48

    }
    println("After let the value is $x")

    userObj.run {
        this.name="knowledge foryou (run)"
        this.age=58
    }
    println("After run the value is $userObj")

    with(userObj){
        name="knowledge foryou (with)"
        age=68
    }
    println("After with the value is $userObj")

}
data class User(var name:String="",var age:Int=0)