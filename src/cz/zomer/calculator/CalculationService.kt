package cz.zomer.calculator

fun CalculationService() {
    println("set value x")
    val x = readLine()!!.toDouble()
    println("set value y")
    val y = readLine()!!.toDouble()
    var add = x + y;
    println("Addition = $add");
    var sub = x - y;
    println("Substraction = $sub");
    var mult = x * y;
    println("Multiplication = $mult");
    var div = x / y;
    println("Division = $div");

}