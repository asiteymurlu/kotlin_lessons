import java.time.MonthDay

//Tapsiriq 1:) Bir ededin cut ve yaxud tek oldugunu teyin eden proqram yazin (if istifade et, tekdirse "Eded tektir",
//cutdurse "Eded cutdur" print olunsun)

/*
fun main() {
    println("Enter a number:")
    val number = readLine()!!.toInt()

    if(number %2 == 0){
        println("The number you entered is even")
    } else {
        println("The number you entered is odd")
    }
}
*************************************************************************************/

// Tapsiriq 2:) Bir ededin musbet, menfi ve yaxud 0 oldunu teyin eden proqram yaz. (1 ci tapsiriqdaki kimi print etsin)

/*
fun main (){
    println("Enter a number:")
    val number = readLine()!!.toInt()
    if (number > 0){
        println("The number you entered is positive")
    } else if(number < 0) {
    println("The number you entered is negative")
    } else {
        println("The number you entered is zero")
    }
}
***********************************************************************************************/

//Tapsiriq 3:) Bir String deyiskenin bos olub olmadigini yoxlayan proqram yazin.Eyni qaydada print etsin

/*
fun main (){
   val x = ""
   if (x.isEmpty()){
       println("Enter a string")
   } else {
       println("Well done")
   }
}
**************************************************************************************/

//Bir istifadecinin sistemi giris edib etmediyini yoxlayan proqram yazin (Birdene isLogged deyiskenimiz olsun, ona gore
//teyin edek true ve yaxud false olmasina gore), Giris edible Xos gelmisiniz, etmeyibse Zehmet olmasa daxil olun yazisi cixsin

/*
fun main() {
   val isLogged = false

   if (isLogged ){
      println("Zehmet olmasa daxil olun")
   } else {
      println("Xos gelmisiniz")
   }
}
************************************************************************************************************/

//1) Elimizde olan int degere gore heftenin gununu ekrana yazdiran proqram yaz. Eger deyer heftenin her hansisa bir gunun
// dusmurse, "Bu reqeme uygun gelen gun yoxdur!" qaytarilsin. Eks halda meselen 2 dirse "Cersenbe axsami" qaytarilsin. (When
// istifade ederek yaz)

/*
fun main() {
   println("Enter a number :")
    var day = readLine()!!.toInt()

    when(day){
        1 -> {
            println("Monday")
        }
        2 -> {
            println("Tuesday")
        }
        3 -> {
            println("Wednesday")
        }
        4 -> {
            println("Thursday")
        }
        5 -> {
            println("Friday")
        }
        6 -> {
            println("Saturday")
        }
        7 -> {
            println("Sunday")
        }
        else -> {
            println("There is no any day under this number")
        }
    }
}
******************************************************************************/

//Elimizde olan bir int deger var, bu hansi ayda oldugumuzu gosterir. Meselen 11 dise Noyabr. Bu reqeme uygun hemin ayda
// olan gun sayini ekrana yazdiran bir proqram yaz. Meselen 11 dise Obtyabrdir demeli, oktyabrda 30 gun var, ekrana 30 yazdirilsin. (When istifade olunsun)

/* fun main() {
    var month = 6
    var result = when (month){
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        else -> "Invalid month"
    }
    println(result)
}
************************************************************************************************************/

// telebe bali qiymetlendirme proqramini when ile yazmag

/*
fun main() {
    println("Enter student point:")
    var studentPoint = readLine()!!.toInt()

    var result = when {
         (studentPoint >= 0 && studentPoint < 51) -> "Failed"
        (studentPoint >= 51 && studentPoint < 71) -> "D"
        (studentPoint >= 71 && studentPoint < 81) -> "C"
        (studentPoint >= 81 && studentPoint < 91) -> "B"
        (studentPoint >= 91 && studentPoint <= 100) -> "A"
        else -> println("Enter valid point")
    }
        println(result)
}
**************************************************************/

//1-10 qeder ededleri for dovru ile yazdirin.

/*
fun main() {
    for (i in 1..10){
        println(i)
    }
}
***************************************************************/

//2) Istifadeciden input olaraq iki reqem isteyin, hemin reqemler arasinda olan reqemlerin umumi cemini tapan proqram yazin.
// (Mes: input1 = 2, input2 = 5, netice = 2+3+4)

/*fun main() {
    println("Enter 2 numbers:")
    var input1 = readLine()!!.toInt()
    var input2 = readLine()!!.toInt()
    var result = 0
    for(i in input1..input2){
        result += i
    }
    println(result)
}
*************************************************************************/
//1-35 qeder olan ededler arasinda ancaq 3e bolunen ededleri ekrana yazdiran proqram yazin

/*fun main() {
    for (i in 1..35){
        if (i %3 == 0){
            println(i)
        }
    }
}
*********************************************************************/
//1-10 qeder ededleri while dovru ile yazdirin

/*fun main() {
    var x = 1
    while (x <= 10){
        println(x)
        x ++  // x += 1
    }
}*/

