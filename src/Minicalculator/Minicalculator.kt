package Minicalculator


fun main() {
    println("birinci reqemi daxil edin:")
    var number1 = readLine()!!.toInt()
    println("ikinci reqemi daxil edin:")
    var number2 = readLine()!!.toInt()
    println("emeliyyat daxil edin (+, -, *, /):")
    var emeliyyat = readLine()!!.toString()

    when (emeliyyat) {
        "+" -> println(toplama(number1, number2))
        "-" -> println(cixma(number1, number2))
        "*" -> println(vurma(number1, number2))
        "/" -> println(bolme(number1, number2))
        else -> println("Please enter a valid operation")
    }
}

fun toplama (number1: Int, number2: Int) {
    println("Netice: ${number1 + number2}") }

fun cixma (number1: Int, number2: Int) {
    println("Netice: ${number1 - number2}") }

fun vurma (number1: Int, number2: Int) {
    println("Netice: ${number1*number2}") }

fun bolme (number1: Int, number2: Int) {
    println("Netice: ${number1/number2}") }

/*fun main() {
    println("Enter the first number:")
    var number1 = readLine()!!.toInt()
    println("Enter the second number:")
    var number2 = readLine()!!.toInt()
    println("Enter the operation (+, -, *, /):")
    var operation = readLine()!!.toString()

    when (operation) {
        "+" -> println(addition(number1, number2))
        "-" -> println(subtraction(number1, number2))
        "*" -> println(multiplication(number1, number2))
        "/" -> println(division(number1, number2))
        else -> println("Please enter a valid operation")
    }
}

fun addition(number1: Int, number2: Int): String {
    return "Result: ${number1 + number2}"
}

fun subtraction(number1: Int, number2: Int): String {
    return "Result: ${number1 - number2}"
}

fun multiplication(number1: Int, number2: Int): String {
    return "Result: ${number1 * number2}"
}

fun division(number1: Int, number2: Int): String {
    if (number2 != 0) {
        return "Result: ${number1 / number2}"
    } else {
        return "Division by zero is not allowed"
    }
}*/
