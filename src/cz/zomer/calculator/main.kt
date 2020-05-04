package cz.zomer.calculator
fun main(args: Array<String>) {
    println("set value x")
    val x = readLine()!!.toDouble()
    println("set value y")
    val y = readLine()!!.toDouble()

    val su = addition(x, y)
    println("Addition = $su")
    val sub = substraction(x, y)
    println("Substraction = $sub")
    val multi = multipliction(x, y)
    println("Mulitplication = $multi")
    val div = division(x, y)
    println("Division = $div")

}