fun task7() {
    println("*********Task 7*********")
    println("\tТест на знание Поттерианы")
    var result = 0
    println(
        "Вопрос 1: Какая модель метлы была у Чжоу Чанг?" +
                "\nВыберите вариант ответа:" +
                "\n1. Чистомёт 2000" +
                "\n2. Комета-260" +
                "\n3. Нимбус 2001"
    )
    var answer1printed: String? = readLine()
    var answer1: String = answer1printed.toString()
    if (answer1 == "2") result += 10
    println(
        "Вопрос 2: Как зовут первого питомца Рона?" +
                "\nВыберите вариант ответа:" +
                "\n1. Короста" +
                "\n2. Питер" +
                "\n3. Гермес"
    )
    var answer2printed: String? = readLine()
    var answer2: String = answer2printed.toString()
    if (answer2 == "3") result += 10
    println(
        "Вопрос 3: С каким из крестражей Гарри встретился первым?" +
                "\nВыберите вариант ответа:" +
                "\n1. Дневник" +
                "\n2. Палочка" +
                "\n3. Шрам"
    )
    var answer3printed: String? = readLine()
    var answer3: String = answer3printed.toString()
    if (answer3 == "3") result += 10
    println(
        "Вопрос 4: Из чего была палочка Гермионы?" +
                "\nВыберите вариант ответа:" +
                "\n1. виноградная лоза" +
                "\n2. кошачья шерсть" +
                "\n3. австралийская пихта"
    )
    var answer4printed: String? = readLine()
    var answer4: String = answer4printed.toString()
    if (answer4 == "1") result += 10
    println(
        "Вопрос 5: Какого цвета глаза Гарри?" +
                "\nВыберите вариант ответа:" +
                "\n1. зелёные" +
                "\n2. как у его матери" +
                "\n3. цвета жаб"
    )
    var answer5printed: String? = readLine()
    var answer5: String = answer5printed.toString()
    if (answer5 == "2") result += 10

    when (result) {
        10 -> println("Попробуй еще раз")
        20 -> println("Слабо")
        30 -> println("Ты можешь лучше")
        40 -> println("Неплохо")
        50 -> println("Превосходно, 10 очков для #факультет_name")
    }
}