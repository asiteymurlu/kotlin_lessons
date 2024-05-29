package classes_objects

//1) Bir eded Person sinfi yazin, icinde ona aid xusiyyetleri olsun. Bir eded Book sinifi yazin, icinde sehifelerin sayi,
// movzusu olsun, Insan kitabi oxumaga baslasin, son sehifeye catanda kitabi bitirsin

/*class Person (var name : String, var age: Int, var nationality: String){

}

class Book (var numberOfPages: Int, var subject: String){

    fun reading(pagenumber: Int) {
        if (pagenumber == numberOfPages){
            println("Kitabi oxuyub bitirdiniz :)")
        }
        var page = pagenumber
        do {
            page ++
        }
        while (page < numberOfPages)
        println("Kitabi oxumaga davam edin")

    }
}

fun main (){

    var book = Book(120, "roman")
    book.reading(6)

}*/

fun main() {
    // Kullanıcıdan kitabın toplam sayfa sayısını al
    print("Kitabın toplam sayfa sayısını girin: ")
    val totalPages = readLine()?.toIntOrNull() ?: return

    // Okunan sayfa sayısını başlat
    var currentPage = 0

    // Kitap okunmaya başlıyor
    println("Kitap okumaya başladınız...")

    while (currentPage < totalPages) {
        // Kullanıcıdan bir sonraki sayfayı okumasını iste
        println("Sayfa $currentPage okundu. Sonraki sayfaya geçmek için 'Enter' tuşuna basın.")
        readLine() // Kullanıcı 'Enter' tuşuna bastığında bir sonraki sayfaya geç
        currentPage++
    }

    // Kitabın son sayfasına ulaşıldı
    println("Tebrikler! Kitabın son sayfasına ulaştınız ve okumayı bitirdiniz.")
}

