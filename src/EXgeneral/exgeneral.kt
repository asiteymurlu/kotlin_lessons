package EXgeneral
//1
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

    }*/
//2
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
    }*/
 //3
/*fun main() {
    isPrime(5)

}

fun isPrime ( number: Int) {

        if (number%2 !==0) {
            println("eded tekdir")
        }else
        println("eded cutdur")
}*/
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

}

}*/

//5
/*
fun main() {
    println("Bir ədəd daxil edin:")
     var input = readLine()!!.toInt()
    var table  = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    multiplicationTable(input, table)

}
fun multiplicationTable(number: Int, array: ArrayList<Int>) {
    for (i in array) {

        println(i*number)

    }

}*/
