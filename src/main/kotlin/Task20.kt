fun task20() {
    println("*********Task 20*********")
    val witchBroom: Aircraft4 = Boeing7472("Nimbus Two Thousand", 9695.0, 117000.0, 500)
    println("Свойство passengerCapacity, наследуемое от интерфейса Passenger, переопределяется в конструкторе класса Boeing747.")
}

open class Aircraft4(val number: String, val flightRange: Double, val capacity: Double) {
    val fuelConsumption: Double
        get() = capacity / flightRange * 100
}

class Boeing7472(number: String, flightRange: Double, capacity: Double, override val passengerCapacity: Int) :
    Aircraft4(number, flightRange, capacity), Passenger {
}

interface Passenger {
    val passengerCapacity: Int
}