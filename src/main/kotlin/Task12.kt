import java.time.Year

fun task12() {
    println("*********Task 12*********")
    println("Введите год (в диапазоне 1000-9999): ")
    val year: String? = readLine()
    println(isLeapYear(Year.parse(year)))
}

fun isLeapYear(year: Year): String {
    return if (year.isLeap)
        "$year високосный"
    else
        "$year не високосный"
}