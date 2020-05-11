package cz.zomer.KotlinSumcalc


fun main(args: Array<String>) {
    println("select 1 for geometric sum, select 2 for arithmetic sum")
    val selectFunction = readLine()!!.toInt()
    if (selectFunction == 1) {
        println("Enter value a")
        val a = readLine()!!.toInt()
        println("Enter value q")
        val q = readLine()!!.toInt()
        println("Enter value n")
        val n = readLine()!!.toInt()
        val geos = geometricSum(a, q, n)
        println("geometric sum of a ($a) q ($q) n ($n) = $geos")
    }
    if (selectFunction == 2){
        println("Enter value a")
        val a = readLine()!!.toInt()
        println("Enter value diff")
        val q = readLine()!!.toInt()
        println("Enter value n")
        val n = readLine()!!.toInt()
        val aris = arithneticSum(a, q, n)
        println("Arithmetic sum of a ($a) q ($q) n ($n) = $aris")
    }
}