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
/* class Calculator {

  var number1: Int
  var number2: Int

  constructor(number1: Int, number2: Int) {
      this.number1 = number1
      this.number2 = number2
  }

  fun addition (no1: Int, no2: Int): Int{

      number1 = no1
      number2 = no2

      var result = number1 + number2
      return result
  }
  fun subtraction (no1: Int, no2: Int): Int {

      number1 = no1
      number2 = no2

      var result = number1 - number2
      return result
  }

  fun multiplication (no1: Int, no2: Int): Int{
      var result = no1 * no2
      return result
  }

  fun division (no1: Int, no2: Int) : Double? {
      var result = (no1.toDouble() / no2)
       if (no2 != 0) {   // return ifin icinde xeta verir
           return result
       } else {
           println("Operation has denied!!")
           return null
       }

  }
  }

  fun main (){

      //var calculator = Calculator (100, 18)
      //println (calculator.division())
//*************************************************************************
// 2*/

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

  val temperature = Temperature()

  temperature.exchangeTemperatureToCelsius(64)
  temperature.exchangeTemperatureToFahranheit(32
  )
}*/
//*************************************************************************************************************************






 */


 */



class Database {
    var users = arrayListOf<User>()

    fun addTempUsers() {

        var asiman = User("Asiman", "123")

        users.add(asiman)
        users.add(User("Novruz", "12223"))
        users.add(User("Tamara", "sdhjd"))

        var murad = User("Murad", "murad")

        users.add(murad)
    }


}

class User {

    var name = ""
    var password = ""
    var emailadd = ""

    constructor(name: String, password: String) {

        this.name = name
        this.password = password
    }


    fun loginToDatabase(baza: Database) {

        var isLogged = false

        for (i in baza.users) {

            if (i.name == name && i.password == password) {
                isLogged = true
            }
        }


        if(isLogged) {
            println("Daxil oldunuz!")
        } else {
            println("Istifadeci adi ve ya parol sehvdi")

        }
    }

}

fun main() {
    var db = Database()
    db.addTempUsers()

    var user1 = User("Asiman", "123")

    user1.loginToDatabase(db)
}