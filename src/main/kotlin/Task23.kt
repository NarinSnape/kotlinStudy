fun task23() {
    println("*********Task 23*********")
    val matiz = Auto("Daewoo Matiz", "Вишневый", "O000OO")
    println(matiz.printInfo())
}

data class Auto(val name: String, val color: String, val number: String) {
    fun printInfo(): String {
        return "Название: $name; \nЦвет: $color; \nНомер: $number"
    }
}