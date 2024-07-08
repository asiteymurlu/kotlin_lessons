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


class Warehouse(var id: Int, var name: String, var balance: Double) {
    val products = arrayListOf<Product>()

    fun getProductByBarcode(barcode: String): Product? {
        for (i in products) {
            if (i.barcode == barcode) {
                return i
            }
        }

        return null
    }


    fun getExpiredDateProducts() {
        var expiredDateProducts = arrayListOf<Product>()
        for (i in products) {
            if (i.year < 2024) {
                expiredDateProducts.add(i)
            }
        }

        expiredDateProducts.forEach { it.info() }

    }

    fun getAllProducts() {
        products.forEach { it.info() }
    }

    fun addProduct(product: Product) {
        if (balance - product.price >= 0) {
            products.add(product)
            balance -= product.price
        } else {
            println("Budcede kifayet qeder mebleg yoxdur")
        }
    }

    fun sellProducts(list: ArrayList<Product>) {

        for (i in list){
            sellProduct(i)
        }

    }

    private fun sellProduct(product: Product){

        products.remove(product)
        balance += product.price
    }

    fun info() {
        println("Warehouse(id=$id, name='$name', balance=$balance, products=$products)")
    }


}

data class Product(var id: Int, var barcode: String, var price: Double, var year: Int, var name: String) {


    fun info() {
        println("$id, $barcode, $price, $year, $name")
    }
}


fun main(){
    var product1 = Product(1, "A123", 12.0, 2025, "pendir")
    var product2 = Product(2, "B123", 15.50, 2026, "yag")
    var product3 = Product(3, "C123", 2.70, 2023, "sud")
    var product4 = Product(4, "D123", 0.80, 2022, "qatiq")
    var product5 = Product(5, "E123", 1.0, 2027, "ayran")

    var warehouse = Warehouse(10, "Anbar", 30.0)

    warehouse.addProduct(product1)
    warehouse.addProduct(product2)
    warehouse.addProduct(product3)
    warehouse.addProduct(product4)
    warehouse.addProduct(product5)


//    var selledProductList = arrayListOf<Product>()
//    selledProductList.add(product5)
//    selledProductList.add(product1)
//
//    warehouse.sellProducts(selledProductList)

    warehouse.getExpiredDateProducts()

    warehouse.info()

}
