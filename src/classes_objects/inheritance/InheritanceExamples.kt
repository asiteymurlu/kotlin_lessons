package classes_objects.inheritance


class Cat(
    name: String,
    age: Int,
    height: Int,
    var color: String,
) : Animal(name, age, height) {

    override fun info() {
        super.info()
        println("Color: $color")
    }
}

class Dog(
    name: String,
    age: Int,
    height: Int,
    var weight: Double
) : Animal(name, age, height) {

    override fun info() {
        super.info()
        println("Weight : $weight")
    }

}

class Bird(
    name: String,
    age: Int,
    height: Int,
    var isFlying: Boolean
) : Animal(name, age, height) {
    override fun info() {
        println("$name is flying: $isFlying")
    }


}

open class Animal(
    var name: String,
    var age: Int,
    var height: Int
) {
    open fun info() {
        println("Name: $name | Age: $age | Height: $height")
    }

}

fun main() {
    val cat = Cat("Mestan", 3, 30, "Green")
    //cat.info()
    val dog =Dog ("Bobik", 2, 60, 5.0 )
    //dog.info()
    val bird = Bird ("Qartal", 1, 12, true)
    bird.info()
}