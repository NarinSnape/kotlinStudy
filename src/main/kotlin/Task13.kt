fun task13() {
    println("*********Task 13*********")
    println("Введите фамилии по одной (введите \"стоп\" для их подсчета):")
    val lastNames: MutableList<String> = mutableListOf()
    var lastName: String?
    do {
        lastName = readLine()
        lastNames.add(lastName.toString())
    } while (lastName != "стоп")

    for (name in lastNames.toTypedArray())
        if (name.isBlank()||name == "стоп")
            lastNames.remove(name)
    println(countLastNames(*lastNames.toTypedArray()))
}

fun countLastNames(vararg lastNames: String): String {
    var counter = 0
    for (name in lastNames) {
        counter += 1
    }
    return "Всего сотрудников: $counter"
}