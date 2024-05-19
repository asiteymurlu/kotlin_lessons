package EXgeneral/*
package EXgeneral
//1
*/
/*fun main() {
    var numbers = arrayListOf(3, 3, 7, 17)
    var result = ortalama(numbers)
    println(result)

}

    fun ortalama ( array: ArrayList<Int>): Double {

        var total = 0.0
        for (i in array) {
            total += i}
            return total/array.size

    }*//*

//2
    */
/*fun main() {
    val numbers = arrayListOf(1, 4, 10, 5, 29, 60)
      var result = findMaxNumber(numbers)
    println(result)

}

    fun findMaxNumber ( array: ArrayList<Int>): Int {

        var largest = array[0]

        for (i in array) {

            if (i > largest){
                largest = i
                }

        }
        return largest
    }*//*

 //3
*/
/*fun main() {
    isPrime(5)

}

fun isPrime ( number: Int) {

        if (number%2 !==0) {
            println("eded tekdir")
        }else
        println("eded cutdur")
}*//*


fun main() {
 */
/*   println(calculateGrade(80))
=======
 //4
/*fun main() {
    println(calculateGrade(80))


}

fun calculateGrade  ( point: Int) {

    when (point) {
        in 90..100 -> println ("A")
        in 80..90 -> println ("B")
        in 60..80 -> println ("C")
        in 0..60 -> println ("D")

}*//*

    println("enter number")
    var x = readLine()!!.toInt()
    println("enter number2")
    var y = readLine()!!.toInt()
    fun isOdd (x: Int) {
        println(true)
    }
    fun isEven (y: Int) {
        true
    }

    when {
        x.isOdd() -> print("x is odd")
        y.isEven() -> print("y is even")
        else -> print("x+y is odd")
    }
}

<<<<<<< HEAD
fun isOdd (number: Int) {
   if (number%2 !== 0)
      true
}
fun isEven (number: Int) {
    if (number%2 == 0)
        true
=======
}*//*


//5

fun main() {
    //println("Bir ədəd daxil edin:")
     //var input = readLine()!!.toInt()
    //var table  = 1..10

    //multiplicationTable(input, table)
    multiplacationTable3()
}
fun multiplicationTable(number: Int, range: IntRange) {
    for (i in range) {

        println(i*number)

    }

}

fun multiplacationTable3() {
    for (i in 1..10) {

        println("************************************")
        println("$i -ye gore vurma cedveli: ")

        for(j in 1..10) {
            println("$i * $j = ${j * i}")
        }

    }

}
*/