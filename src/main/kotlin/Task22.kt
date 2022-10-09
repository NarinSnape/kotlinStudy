fun task22() {
    println("*********Task 22*********")
    val witchBroom: Aircraft6 = Boeing7474("Nimbus Two Thousand", 9695.0, 117000.0, 500)
    witchBroom.printInfo()
}

abstract class Aircraft6(
    protected val number: String,
    protected val flightRange: Double,
    protected val capacity: Double
) {
    protected val fuelConsumption: Double
        get() = capacity / flightRange * 100

    open fun printInfo() {
        println("Номер самолета: $number; \nмакс.длительность полета: $flightRange; \nвместимость бака: $capacity; \nрасход топлива на 100км: $fuelConsumption")
    }
}

class Boeing7474(number: String, flightRange: Double, capacity: Double, override val passengerCapacity: Int) :
    Aircraft6(number, flightRange, capacity), Passenger3 {
    override fun printInfo() {
        println("Номер самолета: $number; \nмакс.длительность полета: $flightRange; \nвместимость бака: $capacity; \nрасход топлива на 100км: $fuelConsumption; \nвместимость пассажиров: $passengerCapacity")
    }
}

interface Passenger3 {
    val passengerCapacity: Int
}