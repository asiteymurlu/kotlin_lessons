package classes_objects

//1) Bir eded Person sinfi yazin, icinde ona aid xusiyyetleri olsun. Bir eded Book sinifi yazin, icinde sehifelerin sayi,
// movzusu olsun, Insan kitabi oxumaga baslasin, son sehifeye catanda kitabi bitirsin

class Person (var name : String, var age: Int, var nationality: String){

}

class Book (var numberOfPages: Int, var subject: String){

    fun reading(pageNumber: Int): Boolean {
        var startReading = true
        var endReading = true
        if (pageNumber == 1) {
            return startReading
        } else if (pageNumber == 120) {
            return endReading
        } else false
    } }

    fun finishBook(pageNumber: Int){

        var leftPages = numberOfPages - pageNumber
        var name : Person
        if (pageNumber == numberOfPages){
            println("Hoermetli kitabi oxuyub bitirdiniz!")
        } else
        { println("Kitabin bitmeyine $leftPages qalib")
    }
}

fun main (){
    var person = Person("Asiman", 28, "az")
    var book = Book(120, "roman")

    book.finishBook(90)
}
}


