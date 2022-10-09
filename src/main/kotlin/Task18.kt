fun task18() {
    println("*********Task 18*********")
    val witchBroom: Aircraft2 = Aircraft2("Nimbus Two Thousand", 9695.0, 117000.0)
    println("Свойства номер воздушного судна, максимальная дальность полета и вместимость бака определяются через конструктор.")
}

class Aircraft2(val number: String, val flightRange: Double, val capacity: Double) {
    val fuelConsumption: Double
        get() = capacity / flightRange * 100
}