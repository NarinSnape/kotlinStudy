fun task19() {
    println("*********Task 19*********")
    val witchBroom: Aircraft3 = Boeing747("Nimbus Two Thousand", 9695.0, 117000.0, 500)
    println("Создан наследник класса Aircraft с названием Boeing747 и свойством, обозначающим вместимость пассажиров.")
}

open class Aircraft3(val number: String, val flightRange: Double, val capacity: Double) {
    val fuelConsumption: Double
        get() = capacity / flightRange * 100
}

class Boeing747(number: String, flightRange: Double, capacity: Double, passengerCapacity: Int) :
    Aircraft3(number, flightRange, capacity)