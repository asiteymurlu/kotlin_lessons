package exception_handling

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


fun main() {

    var cars = arrayListOf("BMW", "MERCEDES", "AUDI")

    try {
        println("Cars 3 index: ${cars[3]}")

    } catch (e: IndexOutOfBoundsException){
        println("Bu index yoxdur")
    } finally {
        println("Test")
    }


}