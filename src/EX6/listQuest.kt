package EX6

fun main() {


// 1.1
    /*val fruits = arrayListOf("alma", "armud", "kivi", "banan", "portagal")
    for (x in fruits)
        println("$x")*/

// 1.2
    /*val cities = arrayListOf("Baki", "Sheki", "Qax", "Qebele", "Gence")
    cities [2] = "Zaqatala"
    println(cities)*/

// 1.3
    /*val animals = arrayListOf("it", "ayi", "peleng", "canavar", "timsah")
    animals.removeAt(1)
    println(animals.size)
    println(animals)*/

// 1.4
    /*val numbers = arrayListOf(1, 4, 12, 5, 29, 71, 70, 36, 0)
    val numbersDividedTwo = arrayListOf<Int>()



    for (x in numbers) {
        if (x%2 == 0)
            numbersDividedTwo.add (x)
    }
    println("Ikiye bolunen edeler bunlardir: $numbersDividedTwo")*/
// 2.1
    /*val colors = hashSetOf("qara", "boz", "ag", "sari", "qirmizi")

    colors.add("boz")
    colors.add("yasil")

    println(colors)*/

// 2.2
    /*val country = hashSetOf("Turkiye", "Misir", "Israil", "Ispaniya", "Italiya")

    println("Bir olke daxil edin.")
    var input = readLine()!!.toString()
    if (input in country) {
        println("Daxil etdiyiniz olke artiq movcuddur")
    } else
        println("Daxil etdiyiniz olke movcud deyil")*/

// 2.3
    /*val numbers = arrayListOf(1, 4, 12, 5, 29, 71, 70, 36, 0)


    var largest = numbers[0]
    var smallest = numbers[0]

    for (i in numbers) {
        if ( i < smallest) {
            smallest = i
        }
        if (i > largest){
            largest = i

        }
    }
    println("The largest number is: $largest")
    println("The smallest number is: $smallest")*/

//2.4
    /*val phones = hashSetOf("Motorolla", "Samsung", "Honor", "Huawei", "Xiaomi" )
    for (i in phones.size - 1 downTo 0) {
        println(phones.elementAt(i))
    }*/

//3.1
   /* var studentAge = hashMapOf<String, Int>()

    studentAge["Elman"] = 22
    studentAge["Mehman"] = 23
    studentAge["Rehman"] = 21
    for (i in studentAge.keys) {
    println("Telebe: $i, yasi: ${studentAge[i]}")}*/

//3.2
    /*var countryCapital = hashMapOf<String, String>()
    countryCapital["Turkey"] = "Istanbul"
    countryCapital["Azerbaijan"] = "Baku"
    countryCapital["Italy"] = "Rome"
    countryCapital["Polan"] = "Warsaw"
    countryCapital["Japan"] = "Tokio"

    countryCapital["Turkey"] = "Ankara"
    for (i in countryCapital.keys){
        println("Olke: $i, Paytaxt: ${countryCapital[i]}")
    }*/
 //3.3

   /* var fruitsPrice = hashMapOf<String, Int>()

    fruitsPrice["Alma"] = 3
    fruitsPrice["Armud"] = 2
    fruitsPrice["Heyva"] = 5

        println(fruitsPrice["Alma"])*/

//3.4

    val fruitsPrice = hashMapOf<String, Int>()

    fruitsPrice["Alma"] = 3
    fruitsPrice["Armud"] = 2
    fruitsPrice["Heyva"] = 5
    //Indexdeki acari gormek ucun

    for (i in fruitsPrice.keys ) {
        println("Acar: $i")
    }





}