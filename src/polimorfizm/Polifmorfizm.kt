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

open class Vehicle {

}

open class Transport {

}


class Car: Vehicle(), Drivable {
    override fun drive() {
        println()
    }

}

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class Airplane: Drivable, Flyable{
    override fun fly() {
        println("Flying")

    }

    override fun drive() {
        println("Driving")
    }
}




fun main() {
    val car = Car()
    car.drive()
    var airplane = Airplane()
    airplane.drive()
    airplane.fly()
}