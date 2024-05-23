package Ex7

import kotlin.math.PI

fun main() {
    // 1

    greet ("Asiman")

    //2

    /*    areaOfCircle(5)
    var result = areaOfCircle(5)
    println(result)*/
    //4

    //var result = areaOfTriangle(8,5)
    //println(result)


    val numbers = arrayListOf(3, 5, 15, 2, 0, 20)





    println(isNumberFind(-15, numbers))

}


fun isNumberFind(input: Int, array: ArrayList<Int>): Boolean {

    var isNumberExist = false

    for (i in array) {

        if (i == input)
            isNumberExist = true

    }
    return isNumberExist

}

fun greet(name: String) {

    println("Salam $name")
}

fun areaOfCircle(r: Int): Double {
    return PI * r * r

}

fun areaOfTriangle(a: Int, h: Int): Int {

    return a * h / 2
}

