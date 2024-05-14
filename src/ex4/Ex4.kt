package ex4

fun main() {
    println("birinci reqemi daxil edin")
   var a = readLine()!!.toInt()
    println("ikinci reqemi daxil edin")
   var b = readLine()!!.toInt()
    println("ucuncu reqemi daxil edin")
    var c = readLine()!!.toInt()

    var d: Double = (a + b + c)/3.0
    println("result: $d")
}
