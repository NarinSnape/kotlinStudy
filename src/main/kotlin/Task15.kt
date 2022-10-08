fun task15() {
    println("*********Task 15*********")
    val strings: Array<String> = arrayOf("hello", "Massive element №2", "Some text", 65654.toString(), "Made in Russia")
    val printer = { _: Array<String> ->
        for (element in strings)
            println(element)
    }
    printer(strings)
}
