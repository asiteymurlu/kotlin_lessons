package opptask2

/*Anbar proqrami yazin. Bu anbarda mallarin siyahisi olsun, siyahiya birbasa access olmasin.

Warehouse sinifi
---Deyerler----
1) id,
2) name
3) products
4) balance (budcesi)

---Metodlar---
1) barcode gore product qaytaran metod (return etsin, yoxdusa null qaytarsin)

2) vaxti kecmis mallari gosteren metod (ile gore gosterecek 2024 < olanlar)

3) Butun mallari gosteren metod

4) mal qebulu metodu, bu metod mali elave edecek, lakin elave etmeden once hemin malin isChecked deyeerini true
edecek sonra qebul edecek. Her mal elave edildike budceden hemin malin qiymeti cixilmalidi. Eger budcede odenis
etmek ucun mebleg yoxdusa elave ede bilmemelidi.

5) Mal satmaq metodu, mallari cem sekilde sata bilmek. ve budceye hemin pullari elave etmek

Product sinifi:

---Deyerler---
1) id
2) barcode (tekrarlana bilmez)
3) price
4) year
5) name

---Metodlar--
1) info()

Elave tapsiriqlar:
1) Product sinifinde data class istifade etmek
2) main metodunda bir productu barcode gore getirmek, ve null olsa bele onun info metoduna getmeye calismaq,
NullPointerException aldiginda onu try catch ile handle etmek.*/


class Warehouse( var id :Int, var name: String, var product: Product, var balance: Double){
    val products = arrayListOf<Product>()
}
data class Product(var id: Int, var barcode:Int, var price:Double, var year:Int, var name:String){


    fun info(){

        println("$id, $barcode, $price, $year, $name")
    }
}