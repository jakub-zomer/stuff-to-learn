package cz.zomer.calculator
fun main(args: Array<String>) {
    println("set value a")
    val a = readLine()!!.toDouble()
    println("set value b")
    val b = readLine()!!.toDouble()

    val service = CalculationService(a, b)
    val su = service.addition()
    println("Addition = $su")
    val sub = service.substraction()
    println("Substraction = $sub")
    val multi = service.multipliction()
    println("Mulitplication = $multi")
    val div = service.division()
    println("Division = $div")

}