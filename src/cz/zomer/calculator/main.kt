package cz.zomer.calculator
fun main(args: Array<String>) {
    println("set value x")
    val x = readLine()!!.toDouble()
    println("set value y")
    val y = readLine()!!.toDouble()

    sum(x, y)
    subs(x, y)
    multip(x, y)
    division(x, y)
}