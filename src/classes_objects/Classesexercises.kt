package classes_objects

// 2. tapsiriq

/*class Student {
    var name = ""
    var age = 0
    var averagePoint = 0

    constructor(studentAge: Int) {
        age = studentAge
    }

    constructor()

    constructor(studentName: String, studentAge: Int, studentAveragePoint: Int) {
        age = studentAge
        name = studentName
        averagePoint = studentAveragePoint
    }

    fun info() {
        println("Name of student is : $name")
        println("Age of student is : $age")
        println("Average point of student is : $averagePoint")
    }

    fun yasiniArtir() {

        age++
    }

    fun derseGet(student: Student) {

    }

    fun changeStudentName(student: Student, name: String) {
        student.name = name
    }
}

fun main() {

    var student = Student("Sara", 19, 12)*/
    //var student2 = Student(12)
    //student.info()

    //var student3  = Student()
    //student3.info()

    //student.changeStudentName(student, "Asiman")
    //student.yasiniArtir()   // eger print-i funksiyadan qiraqda burda yazsaydim onda student.age yazmaliyam age evezine
    //student.info()
//}
// Class function-nun parametrleri nece teyin olunur ki?

// 3. tapsiriq

/*class Car {

    var speed = 0
    var name = ""                          // Classimizin deyerleri
    var color = ""
    var maxSpeed = 350
    var motorOnOff: Boolean = false
    fun runMotor() {
        motorOnOff = true
        println("Muherrik isleyir")

    }

    fun motorOff() {
        motorOnOff = false
        println("Muherrik islemir")

    }

    fun increaseSpeed(number: Int) {
        if(motorOnOff == false){
            println("Muherrik sonuludur")
        } else {
            if ((speed + number) >= 350) {
                speed = 350
                println("Maksimum suret heddine catmisiniz!")
            } else {
                speed += number
                println("Suret $number qeder artirildi!")
                println("Hazirki suret $speed")
            }

        }
    }

    fun decreaseSpeed(number: Int) {
        if(motorOnOff == false){
            println("Muherrik sonuludur")
        } else {
            if ((speed - number) <= 0) {
                speed = 0
                println(" Masin dayandi")
                motorOnOff = false
            } else {
                speed -= number
                println("Suret $number qeder azaldildi!")
                println("Hazirki suret $speed")
            }

        }
    }

    fun info() {
        println("Car name is: $name")

        println("Car speed is: $speed")
        println("Car color is: $color")
        println("Car max speed is: $maxSpeed")
        println("Car engine is: $motorOnOff")
    }
}

*//*fun main() {

    val car = Car() // Car classindan car objecti yaradiriq
    car.speed = 120
    car.color = "Grey"
    car.maxSpeed = 180
    car.motorOnOff = true

}*//*

// tapsiriq 4
class CarMechanic (var name : String, var experience: String, var age: Int, var height: Int) {
    fun fixCar (car: Car) {
        println("${car.name} has fixed succesfully.")
    }
}

 fun main () {

     val carMechanic = CarMechanic("Tural", "5 years", 21, 186)
     val car = Car()
     car.name = "Mercedes"
     car.color = "Red"

     //carMechanic.fixCar(car)


     car.increaseSpeed(100)
     car.runMotor()
     car.increaseSpeed(100)

     car.increaseSpeed(260)

     car.info()

     car.decreaseSpeed(400)
     car.info()
 }*/

//************************************************************************
// EXERCISES PART 2
//************************************************************************

//1//
   /* class Calculator (number1: Int, number2: Int){
    var no1 : Int = number1
    var no2 : Int = number2

    fun addition (): Int{
        var result = no1 + no2
        return result
    }
    fun subtraction (): Int {
        var result = no1 - no2
        return result
    }

    fun multiplication (): Int{
        var result = no1 * no2
        return result
    }

    fun division () : Any {
        var result = (no1.toDouble() / no2)
         return if (no1 !== 0) {   // return ifin icinde xeta verir
             result
         } else {
             println("Operation has denied!!")
         }

    }
    }

    fun main (){

        var calculator = Calculator (65, 32)
        println (calculator.division())

    }*/
//*************************************************************************
// 2

/* class Temperature {

    constructor()

     fun exchangeTemperatureToCelsius (tempF : Int){

         println("Temperature is  ${((tempF - 32) / 1.8)} Celsius" )

     }

    fun exchangeTemperatureToFahranheit (tempC : Int){

        println("Temperature is ${(tempC * 1.8 + 32)} Fahranheit" )
    }


 }
fun main (){

    val temperatureCelsius = Temperature()
    val temperatureFahranheit = Temperature ()
    temperatureCelsius.exchangeTemperatureToCelsius(64)
    temperatureFahranheit.exchangeTemperatureToFahranheit(32
    )
}*/
//*************************************************************************************************************************
//3
class Database{
    var users = arrayListOf("user1", "user2", "user3")
}

class User{
   var name = ""
   var password = ""
   var emailadd = ""

   fun loginToDatabase(name: String){
      if (name in  ) {
         println("User is allowed")
      } else {
         println("User has nor access")
      }
   }

}
