package cz.zomer.calculator

class CalculationService(val a: Double, val b: Double) {

    fun addition(): Double {
        return a + b
    }

    fun substraction(): Double {
        return a - b
    }

    fun multipliction(): Double {
        return a * b
    }

    fun division(): Double {
        return a / b
    }

}

