fun main() {
    ABC.objWithCom()
    ABC.XYZ.objWithoutCom()
}

class ABC {
    object XYZ {
        fun objWithoutCom() {
            println("object without companion")
        }
    }

    companion object YZX {
        @JvmStatic
        fun objWithCom() {
            println("object with companion its just like static keyword in java")
        }
    }
}