fun task21() {
    println("*********Task 21*********")
    val witchBroom: Aircraft5 = Boeing7473("Nimbus Two Thousand", 9695.0, 117000.0, 500)
    println("Класс Aircraft стал абстрактным.")
}

abstract class Aircraft5(val number: String, val flightRange: Double, val capacity: Double) {
    val fuelConsumption: Double
        get() = capacity / flightRange * 100
}

class Boeing7473(number: String, flightRange: Double, capacity: Double, override val passengerCapacity: Int) :
    Aircraft5(number, flightRange, capacity), Passenger2 {
}

interface Passenger2 {
    val passengerCapacity: Int
}