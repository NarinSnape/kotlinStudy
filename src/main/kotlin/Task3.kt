var five: Char = '5'
fun task3() {
    println("*********Task 3*********")
    if(five.toString() is String)
        println(five + " is converted to String")
    if(five.code.toByte() is Byte)
        println(five + " is converted to Byte")
    if(five.code.toShort() is Short)
        println(five + " is converted to Short")
    if(five.code is Int)
        println(five + " is converted to Int")
    if(five.code.toDouble() is Double)
        println(five + " is converted to Double")
    if(five.code.toFloat() is Float)
        println(five + " is converted to FLoat")
    if(five.code.toLong() is Long)
        println(five + " is converted to Long")
}