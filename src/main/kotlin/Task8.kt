fun task8() {
    println("*********Task 8*********")
    println("Введите сумму вклада:")
    var depoSum: Double = readLine()!!.toDouble()
    println("Введите длительность вклада (в месяцах):")
    var depoDuration: Int = readLine()!!.toInt()
    println("Введите ежемесячный процент (в формате 0.05):")
    var depoPercent: Double = readLine()!!.toDouble()
    for (n in 1..depoDuration) {
        var monthAdd = depoSum * depoPercent
        depoSum += monthAdd
        println(
            n.toString() + " месяц: " +
                    "\n увеличение на: " + monthAdd +
                    "\n итоговая сумма: " + depoSum
        )
    }
}