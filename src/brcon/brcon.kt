package brcon

fun main() {
    /*for (i in 1..10) {

        if (i%2 == 0)
            continue
        if (i > 7) {
            break
        }
        println ("$i")

    }*/
    /*var i = 1
    while (i < 100) {
        if (i == 65){
            break
        }
        println("reqem: $i")
        i +=1

    }*/

    var i = 1
    var countDivededFive = 0
    while (i < 3) {


        println("Asiman: $i")

        if (i%5 == 0) {
            countDivededFive +=1

        } else {

        }

        i +=1
    }



    println("bese bolunen ededlerin sayi : $countDivededFive ")

}