fun task10() {
    println("*********Task 10*********")
    val cities: MutableList<String> = mutableListOf()
    var city: String? = ""
    var choice: String? = ""
    do {
        println(
            "Выберите действие:" +
                    "\n1. Добавить название города в программу." +
                    "\n2. Посмотреть в консоли список всех добавленных городов." +
                    "\n3. Посмотреть список добавленных городов без повторений." +
                    "\n4. Выход из программы."
        )
        choice = readLine()
        if (choice == "1") {
            println("Вы выбрали 1 - Добавить название города в программу. Введите название города:")
            city = readLine()
            cities.add(city.toString())
        }
        if (choice == "2") {
            println("Вы выбрали 2 - Посмотреть в консоли список всех добавленных городов.")
            for (city in cities)
                println(city)
        }
        if (choice == "3") {
            println("Вы выбрали 2 - Посмотреть список добавленных городов без повторений.")
            for (n in 0..cities.lastIndex) {
                if (n != 0)
                    if (cities[n] == cities[n - 1])
                        continue
                println(cities[n])
            }
        }
    } while (choice != "4")
    //- Выход из программы
}
