package ex3

fun main () {
    var day: Int? = 1

    println("Heftenin gununu daxil edin: ")

    day = readLine()?.toIntOrNull()


    when (day) {

        null -> {
            println("Reqem daxil etmemisiniz!")

        }

        1 -> {
            println("Bazar ertesi")
        }

        2 -> {
            println("Cersenbe axsami")
        }

        3 -> {
            println("Cersenbe")
        }

        4 -> {
            println("Cume axsami")
        }

        5 -> {
            println("Cume")
        }

        6 -> {
            println("Senbe")
        }

        7 -> {

            println("Bazar")
        }

        else -> println("Bu reqeme uygun gelen gun yoxdur!")
    }

}


    /*val ay = 4


    val result = when (ay) {
        1, 3, 5 -> "31"
        2 -> "29"
        3 -> "31"
        4 -> "30"
        else -> "Invalid day."
    }
    println (result)
    }*/