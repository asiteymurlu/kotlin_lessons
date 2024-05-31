package polimorfizm


//Abstract classes
/*
abstract class Animal {
    var name: String = ""
    var color: String = "white"

    abstract fun makeSound()

    abstract fun getAge(): Int

    open fun test() {
        println("Test")
    }

}

class Cat: Animal() {
    var test: String = "test"

    override fun makeSound() {
        println("Cat myavv")
    }

    override fun getAge(): Int {
        TODO("Not yet implemented")
    }
}

fun main() {

    var cat = Cat()

    cat.makeSound()

    //var cat2 = Animal()
}



*/

/*
fun main() {
    var circle = Circle(2)
    var rectangle = Rectangle(4, 6)
    var triangle =Triangle(4,6,8,5)
    println( "Cevrenin sahesi:" + circle.calculateArea())
    println("Cevrenin perimetri: ${circle.calculatePerimeter()}")
    println( "Ucbucagin sahesi:" + triangle.calculateArea())
    println("Ucbucagin perimetri: ${triangle.calculatePerimeter()}")
    println( "Dorbucaqlinin sahesi:" + rectangle.calculateArea())
    println("Dordbucaqlinin perimetri: ${rectangle.calculatePerimeter()}")
}

interface Shape {
     fun calculateArea(): Double
     fun calculatePerimeter(): Double
}

class Circle(var radius: Int) : Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(var left: Int, var right: Int) : Shape {
    override fun calculateArea(): Double {
        return left * right.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return 2 * (left + right).toDouble()
    }
}

class Triangle(var left: Int, var right: Int, var bottom: Int, var meridian: Int) : Shape {
    override fun calculateArea(): Double {
        return 0.5 * bottom * meridian
    }

    override fun calculatePerimeter(): Double {
        return left + right + bottom.toDouble()
    } }*/
/*abstract class Person(var name: String) {
    abstract fun introduce()
}

interface Employable {
    fun work()
}


class Teacher(name: String): Person(name),Employable{
    override fun introduce() {
        println("Teacher $name introduce")
    }

    override fun work() {
        println("Teacher $name can work")
    }
}
class Engineer(name: String):Person(name),Employable{
    override fun introduce() {
        println("Engineer $name introduce")
    }

    override fun work() {
        println("Engineer $name can work")
    }
}

fun main(){
    var teacher =Teacher("Aysel")
    var engineer = Engineer("Asiman")

    teacher.introduce()
    teacher.work()
    engineer.introduce()
    engineer.work()
}*/

/*interface Flyable {
    fun fly()
}

interface Eatable {
    fun eat()
}
class Bird():Flyable,Eatable{
    override fun fly() {
        println("Bird can fly")
    }

    override fun eat() {
        println("Bird is eatable")
    }
}
fun main(){
    var bird= Bird()

    bird.eat()
    bird.fly()
}*/

/*
 abstract class Device(var isPowerOn: Boolean){

     abstract  fun turnOn()
     abstract fun turnOff()
 }
class Computer(isPowerOn: Boolean):Device(isPowerOn){
    override fun turnOn() {
        isPowerOn = true
        println("Computer is power on: $isPowerOn ")
    }

    override fun turnOff() {
        isPowerOn = false
        println("Computer is power on: $isPowerOn")
    }
}
class  Phone(isPowerOn: Boolean):Device(isPowerOn){
    override fun turnOn() {
        isPowerOn = true
        println("Phone is power on: $isPowerOn ")
    }

    override fun turnOff() {
        isPowerOn = false
        println("Phone is power on: $isPowerOn ")
    }
}
fun main(){
    var computer =Computer(false)
    var phone = Phone(true)

    computer.turnOn()
    computer.turnOff()
    phone.turnOff()
    phone.turnOn()
}*/


/*
open class Vehicle {
    open fun fixed() {
        println("Vehicle fixed")
    }
}

class Car: Vehicle() {
    override fun fixed() {
        println("Car is fixed")
    }
}

class Bus: Vehicle() {
    override fun fixed() {
        println("Bus is fixed")
    }
}

class Truck: Vehicle() {

}

class Mechanic {

    */
/*fun fixCar(car: Car) {
        println("Car $car is fixed")
    }

    fun fixBus(bus: Bus) {
        println("Bus $bus is fixed")
    }*//*



    fun fixVehicle(vehicle: Vehicle) {
        vehicle.fixed()
    }

}

fun main() {
    val car = Car()
    val bus = Bus()
    val truck = Truck()

    val mechanic = Mechanic()
    mechanic.fixVehicle(car)
    mechanic.fixVehicle(bus)
    mechanic.fixVehicle(truck)
}*/
open class Document(){
    open fun printing(){
        println("Document is printing")
    }
}
class PDF():Document(){
    override fun printing() {
        println("PDF document is printing")
    }
}
class Word():Document(){
    override fun printing() {
        println("Word document is printing")
    }
}

class Printer(){

    fun printDocument(document: Document){
        document.printing()
    }
}
fun main(){
    var printer = Printer()
    printer.printDocument(PDF())
    printer.printDocument(Word())
}