package brcon

fun main() {


    val numbers = arrayListOf(1, 15, 21, 2, 0, -5, 12)
    var isListContainsNumber = false

    println("Reqem daxil edin :")
    var input = readLine()!!.toInt()
    for (a in numbers) {
        if (input == a) {
            isListContainsNumber = true
            break
        }

    }

    if(isListContainsNumber) {
        println("reqem listde var!!")

    } else {
        println("reqem listde yoxdu!!")

    }


}