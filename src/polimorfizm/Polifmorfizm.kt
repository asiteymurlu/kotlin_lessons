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
    } }