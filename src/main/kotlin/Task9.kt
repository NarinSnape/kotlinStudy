fun task9() {
    println("*********Task 9*********")
    val countryNames: Array<String> = arrayOf("Горенлания", "Голарион", "Морровинд")
    val countryCapitals: Array<String> = arrayOf("Фрума", "Абсалом", "Вивек")
    val countryCurrencies: Array<String> = arrayOf("Монеты", "Кредиты", "Септимы")
    val countries: Array<Array<String>> = arrayOf(countryNames, countryCapitals, countryCurrencies)
    println("Страна\t\tСтолица\tВалюта" +
            "\n--------------------------")
    for (row in 0..countries.lastIndex) {
        for (column in 0..countryNames.lastIndex) {
            print(countries[column][row]+"\t")
        }
        println()
    }
}
