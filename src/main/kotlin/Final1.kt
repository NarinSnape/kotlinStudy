fun final1() {
    println("*********Final 1*********")
    println("Созданы классы самолетов Freighter и BattlePlane.")
}

class Freighter(
    number: String, flightRange: Double, capacity: Double, override val carryingCapacity: Int,
    override val passengerCapacity: Int
) :
    Aircraft6(number, flightRange, capacity), Cargo, Passenger {
    override fun toString(): String {
        return "Номер самолета: $number; \nмакс.длительность полета: $flightRange; \nвместимость бака: $capacity; \n" +
                "расход топлива на 100км: $fuelConsumption;\n" +
                "грузоподъемность: $carryingCapacity; \nвместимость пассажиров: $passengerCapacity"
    }
}

interface Cargo {
    val carryingCapacity: Int
}

class BattlePlane(
    number: String,
    flightRange: Double,
    capacity: Double,
    override val rapidityOfFire: Int,
    override val carryingCapacity: Int
) :
    Aircraft6(number, flightRange, capacity), Fight, Cargo {
    override fun toString(): String {
        return "Номер самолета: $number; \nмакс.длительность полета: $flightRange; \nвместимость бака: $capacity; \n" +
                "расход топлива на 100км: $fuelConsumption; \n" +
                "скорострельность: $rapidityOfFire; \nгрузоподъемность: $carryingCapacity"
    }
}

interface Fight {
    val rapidityOfFire: Int
}