fun main() {

    //Arrays
    /*val fruits = arrayOf("Apple", "Banana", "Orange")

    fruits[2] = "Watermelon"

    fruits[3] = "Pineapple"
    println(fruits[3])*/

    /*val numbers = arrayOf(1, 2, 4, 26, 1)


    for(i in numbers) {
        println("Number: $i")
    }*/

    /*var contacts = arrayListOf("John", "Kate", "Bobby", "Micheal")

    contacts.add("Novruz")
    contacts.add(0, "Asiman")


    contacts.remove("Bobby")

    contacts.removeAt(0)

    println(contacts)*/

    //Sets
    /*var finCodes = hashSetOf("244l2se", "758475e2", "233945a1", "867fgh2", "244l2se")

    finCodes.add("758475e2")

    finCodes.remove("244l2se")

    println(finCodes)*/


    //Maps
    val translations = hashMapOf<String, String>()

    translations["en"] = "Hello"
    translations["az"] = "Salam"
    translations["tr"] = "Selam"

    for (i in translations.keys) {
        println("Key: $i -- Value: ${translations[i]}")
    }
}