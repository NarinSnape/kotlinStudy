fun task14() {
    println("*********Task 14*********")
    println("Введите ФИО сотрудника:")
    val name: String = readLine().toString()
    println("Возраст:")
    val age: String = readLine().toString()
    println("Семейное положение:")
    val status: String = readLine().toString()
    println("Должность :")
    val post: String = readLine().toString()
    if (name.isNotBlank() && age.isBlank() && status.isBlank() && post.isNotBlank()) println(printData(name, post))
    if (name.isNotBlank() && age.isNotBlank() && status.isBlank() && post.isNotBlank()) println(printData(name, age.toInt(), post))
    if (name.isNotBlank() && age.isBlank() && status.isNotBlank() && post.isNotBlank()) println(printData(name, status, post))
    if (name.isNotBlank() && age.isNotBlank() && status.isNotBlank() && post.isNotBlank()) println(printData(name, age, status, post))
}

fun printData(name: String, post: String) = "ФИО: $name; Должность: $post"
fun printData(name: String, age: Int, post: String) = "ФИО: $name; Возраст: $age; Должность:  $post"
fun printData(name: String, status: String, post: String) = "ФИО: $name; Семейное положение: $status; Должность:  $post"
fun printData(name: String, age: String, status: String, post: String) = "ФИО: $name; Возраст:  $age; Семейное положение: $status; Должность: $post"