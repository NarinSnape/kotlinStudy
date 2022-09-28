fun task6() {
    println("*********Task 6*********")
    println("Введите два числа:" +
                "\n  a:")
    var aPrinted: String? = readLine()
    var a: String = aPrinted.toString()
    println("  b:")
    var bPrinted: String? = readLine()
    var b: String = bPrinted.toString()
    var comparison = a.toDouble() > b.toDouble()
    var messageA = "a > b"
    var messageB = "a <= b"
    if (comparison)
        println(messageA)
    else
        println(messageB)
}