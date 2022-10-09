fun task17() {
    println("*********Task 17*********")
    val witchBroom = Aircraft()
    println("Геттер свойства содержащего расход топлива самостоятельно рассчитывается из свойств дальности полета и вместимости бака: ${witchBroom.fuelConsumption}.")
}

class Aircraft
{
    val number: String = "Boeing-777"
    val flightRange: Double = 9695.0
    val capacity: Double = 117000.0
    val fuelConsumption: Double
        get() = capacity / flightRange * 100
}