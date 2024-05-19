package classes_objects

class Phone(phoneName: String, phoneSerialNo: String, phoneColor: String) {

    var name: String = phoneName
    var serialNo: String = phoneSerialNo
    var color: String = phoneColor



    fun call(number: String) {
        println("$number called..")
    }

    fun info() {
        println("Name is : $name")
        println("Serial number is : $serialNo")
        println("Color is : $color")
    }

}

fun main() {

    var phone = Phone("Xiaomi", "36723", "Green")

    changePhoneName(phone)

    phone.info()


    //phone.info()

    //var x = 5;

    //changeNumber(x)

    //println("X: $x")
}


fun changePhoneName(phone: Phone) {
    phone.name = "Nokia"
}

fun changeNumber(x: Int) {
    var a = x
    a = 10
}
