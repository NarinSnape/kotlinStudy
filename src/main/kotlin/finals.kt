fun main() {
    final1()

    println("*********Final 2*********")
    val aircrafts: MutableList<Aircraft6> = mutableListOf()
    val Nimbus: Aircraft6 = Boeing7474("Nimbus Two Thousand", 1500.00, 200.00, 2)
    val Firefly: Aircraft6 = Freighter("Firefly Serenity", 100500.00, 70500.00, 800, 50)
    val Babylon: Aircraft6 = BattlePlane("Babylon V", 1005000.00, 100500.00, 1000, 400)
    aircrafts.add(0, Nimbus)
    aircrafts.add(1, Firefly)
    aircrafts.add(2, Babylon)
    println("Создана коллекция aircrafts из 3 самолетов разных моделей.")

    println("*********Final 3*********")
    var command: String? = ""
    do {
        println(
            "Выберите команду:" +
                    "\n1. Отобразить все данные по всем самолеты авиакомпании." +
                    "\n2. Вывод всех самолетов повышенной дальности." +
                    "\n3. Вывод всех боевых самолетов." +
                    "\n4. Выход из программы."
        )
        command = readLine()
        if (command == "1") {
            for (plane in aircrafts) {
                println(plane.toString())
                println()
            }
        }
        if (command == "2") {
            for (plane in aircrafts) {
                if (plane.getFlightRange > 100000) {
                    println(plane.toString())
                    println()
                } else
                    continue
            }
        }
        if (command == "3") {
            for (plane in aircrafts) {
                if (plane is BattlePlane) {
                    println(plane.toString())
                    println()
                } else
                    continue
            }
        }
    } while (command != "4")
    //- Выход из программы
}