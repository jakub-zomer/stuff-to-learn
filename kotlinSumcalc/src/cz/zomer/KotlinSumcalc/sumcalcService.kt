package cz.zomer.KotlinSumcalc



fun geometricSum(a: Int, q: Int, n: Int): Int {
    var sum: Int
    sum = 0
    var x = a
    var y = q
    var z = n

    while (z > 0) {
        sum = sum + x
        x = x * y
        z--
    }
    return sum
}

fun arithneticSum(a: Int, diff: Int, n: Int): Int {
    var sum: Int
    sum = 0
    var x = a
    var y = diff
    var z = n

    while (z > 0) {
        sum = sum + x
        x = x + y
        z--
    }
    return sum
}
