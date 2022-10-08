import kotlin.math.sqrt

fun task16() {
    println("*********Task 16*********")
    val getSqrt = { x: Double ->
        println(sqrt(x))
    }
    println("Введите число:")
    val x: Double = readLine()!!.toDouble()
    getSqrt(x)
}