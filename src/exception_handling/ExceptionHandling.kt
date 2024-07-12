package exception_handling

import kotlin.jvm.Throws
import kotlin.math.log

/*
import java.io.IOException

fun main() {

    var user1: String = "Asiman"


    try {
        connectDatabase()
        saveUser(user1)
    } catch (ex: IOException) {
        println("Xeta bas verdi")
    } finally {
        closeDatabase()
    }


}

fun connectDatabase() {
    println("Database Connected")
}


fun saveUser(user: String) {
    throw IOException()
    println("$user saved")
}

fun closeDatabase() {
    println("Database closed")
}*/


/*fun main() {

    *//*var cars = arrayListOf("BMW", "MERCEDES", "AUDI")

    try {
        println("Cars 3 index: ${cars[3]}")

    } catch (e:Exception) {
        println("Bu index yoxdur")
    } finally {
        println("Test")
    }*//*

    *//*try {
        login("", "sdsd")

    } catch (e: UserExpiredException) {
        println(e.message)
    }*//*


    login("", "")*/

/*
}

@Throws(UserExpiredException::class)
fun login(username: String, password: String){
    if(username.isEmpty()) {
        throw UserExpiredException()
    }
}

class UserExpiredException(): Exception("User is expired"){

}*/


/*fun dividing (){
    println("Iki eded daxil edin")
    var number1 = readLine()!!.toInt()
    var number2 = readLine()!!.toInt()
    var result = number1/number2.toDouble()

    if (number2 == 0) {
        throw ArithmeticException(println("0-a bolmek olmaz").toString())

    }
    else {
        println("Netice : $result")
    }
}
      fun main(){
          println(dividing())
      }*/

fun dividing () {

    var isExitProgram = false


    while (!isExitProgram){

        try {
            println("Iki eded daxil edin")
            var number1 = readLine()!!.toInt()
            var number2 = readLine()!!.toInt()

            if(number1 == 5 && number2 == 5) {
                isExitProgram = true
            }

            var result = number1 / number2

            println("Netice: $result")
        } catch (e: NumberFormatException) {
            println("DUZGUN daxi ledin")
        } catch (e: ArithmeticException) {
            println("0-a bolmek olmaz")

        }
    }
}

fun main() {
    dividing()
}