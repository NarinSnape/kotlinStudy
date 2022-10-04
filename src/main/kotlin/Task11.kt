fun task11() {
    println("*********Task 11*********")
    val employees: MutableMap<Int,String> = mutableMapOf(1 to "Соколова", 2 to "Орлова", 3 to "Давыдов")
    employees[4] = "Ведас"
    employees[5] = "Морган"
    employees[6] = "Лютикова"
    println("Введите свой номер места.")
    var key: Int = readLine()!!.toInt()
    if(employees.containsKey(key))
        println("Это место занимает " + employees.getValue(key) + ".")
}