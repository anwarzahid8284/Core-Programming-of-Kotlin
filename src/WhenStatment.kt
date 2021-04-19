fun main(args: Array<String>){
    val firstNumber= 11
    val secondaryNumber= 10
    val operators= readLine()
    val result=when(operators){
        "+" -> firstNumber + secondaryNumber
        "-" -> firstNumber - secondaryNumber
        "*" -> firstNumber * secondaryNumber
        else -> "No operator found"
    }
    when(operators){
        "+" -> println("sum of $firstNumber and $secondaryNumber ${firstNumber + secondaryNumber}")
        "-" -> println("sum of $firstNumber and $secondaryNumber ${firstNumber - secondaryNumber}")
        "*" -> println("sum of $firstNumber and $secondaryNumber ${firstNumber * secondaryNumber}")
    }
    print(result)
}