    fun  main(args:Array<String>){
        val  add=Addition()

        // constructor overloading
        add.addTwoNum(5,10)
        add.addTwoNum("Haroon",15)

        // pass value to primary constructor
       // val obj=PrimarySecondary("Harrom",22)
        val obj2=PrimarySecondary("FSC","Islamabad, Pakistan")

    }
     class Addition(){
        fun addTwoNum(a:Int,b:Int){
            println(a+b)
        }
        fun addTwoNum(name:String,age:Int){
            println("$name is $age year old")
        }
    }

    // this is primary constructor
    class  PrimarySecondary(val name:String,var age:Int){
        init {
            println("$name and $age")
        }
        // for secondary constructor you must call primary constructor also other wise its call expected fro primary constructor
        constructor( education: String, address:String):this("Haroon",22)
        {
            println("$education and $address")
        }

    }

