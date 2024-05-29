package classes_objects

import kotlin.random.Random

// 2) Circle, Rectangle, Triangle sinifleri yazin, bu siniflerin icinde perimetri, ve
// sahesini hesablayan funksiyalar olsun. (Ipucu: Inheritance istifadesi mutleqdir)
/*fun main() {
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

open class Shape {

    open fun calculateArea(): Double {
        return 0.0
    }

    open fun calculatePerimeter(): Double {
        return 0.0
    }
}

class Circle(var radius: Int) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(var left: Int, var right: Int) : Shape() {
    override fun calculateArea(): Double {
        return left * right.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return 2 * (left + right).toDouble()
    }
}

class Triangle(var left: Int, var right: Int, var bottom: Int, var meridian: Int) : Shape() {
    override fun calculateArea(): Double {
        return 0.5 * bottom * meridian
    }

    override fun calculatePerimeter(): Double {
        return left + right + bottom.toDouble()
    }
}*/

//3) Bir eded Phone sinifi yazin, bu telefonun kamerasi olsun, kameranin ozunun megapixeli,
// linza sayi, portret cekimi olsun, ondan elave telefonun ekrani olsun, ekranin reng sayi, olcusu, curve olub olmamasi olsun

/*
class Camera(var megapixel:Int, var lensCount: Int, var portretmode:Boolean) {

}
class Screen( var colorCount:Long, var size:Double, var isCurve: Boolean ) {

}
class Phone(var name:String, var camera :Camera, var screen:Screen){
    fun info(){
        println("Telefonun adi: $name ")
        println("telefonun kamera ozellikleri: ")
        println("Kamera megapixeli: ${camera.megapixel}")
        println("Kamerain lensi: ${camera.lensCount}")
        println("Telefonun ekraninin eyriliy: ${screen.isCurve}")

    }
}

fun main (){

    var camera = Camera(200, 4, true)
    var screen = Screen(160000000,6.54,true )
    var phone = Phone("Poco",camera, screen)

    phone.info()
}*/

// 4) Masin, avtobus, Kamaz siniflerimiz olsun, Vehicle sinifinden toredilsin, Hamisinin ortaq ozellikleri Vehicle sinifinde olsun, bir eded Motor sinifimiz olsun, gucu, ili, olsun. Masinin, kamazin, avtobusun motoru olsun.
// hemcinin xodaSal, sondur kimi metodlari olsun.

// 5) 1-10 na qeder reqemler arasinda bir reqem tutan ve o tutdugu reqemi bizim tapmagimizi
// isdeyen bir proqram yazin, eger 3 cehdde tapa bilsek qalib oluruq, tapanmasaq uduzuruq.
// Meselen: proqramin tutdugu reqem=8 biz daxil etdik 2, bu halda yanlis daxil etdiniz daha boyuk
// reqem daxil edin deyib bize komek edecek, 9 daxil etsek daha kicik reqem daxil edin deyecek,
// bele bele 3 cehdde tapa bilsek udaciyiq tapanmasaq uduzuruq. axirda qalib geldiniz ve ya
// uduzdunuz yazir. Proqramda random deyer yaratmaq (1-10 arasinda)
//var randomNumber = Random.nextInt(1, 11)

fun main(){
    var randomNumber = Random.nextInt(1,11)

    var i = 0

    while (i < 3) {
        println("Texmininizi daxil edin:")
        var number = readLine()!!.toInt()
        if(number == randomNumber){
            println("Tebrikler, ${i + 1}  cehdde dogru tapdiniz ")
            break
        } else if (number < randomNumber){
            println("Cavab yanlisdir. Daha boyuk reqem daxil edin")
        } else{
            println("Cavab yanlisdir. Daha kicik reqem daxil edin")
        }
        i++
    }

    if(i >= 3) {
        println("Uduzdunuz, $i cehdde dogru cavabi tapa bilmediniz")
    }

}