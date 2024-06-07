package opptask2

open class Animal(var id: Int, var name: String, var age: Int) {

    open fun makeSound() {
        println("Bu heyvan sesi cixarir")
    }

    open fun move() {
        println("Heyvan hereket etdi")

    }
}

open class Mammal(id: Int, name: String, age: Int) : Animal(id, name, age) {

    open fun run() {
        println("Mammal is running")
    }

}

open class Reptile(id: Int, name: String, age: Int) : Animal(id, name, age) {
    open fun crawl() {
        println("Reptile is crawling")
    }
}

open class Bird(id: Int, name: String, age: Int) : Animal(id, name, age) {
    open fun fly() {
        println("Bird is flying")
    }
}

class Cat(id: Int, name: String, age: Int) : Mammal(id, name, age) {
    override fun run() {
        println("Cat $name is running")
    }

    override fun makeSound() {
        println("Cat $name makes a sound as : miyav")
    }
}

open class Pigeon(id: Int, name: String, age: Int) : Bird(id, name, age) {
    override fun fly() {
        println("Bird $name is flying")
    }

    override fun makeSound() {
        println("Bird $name makes a sound as : quququq")
    }
}

open class Snake(id: Int, name: String, age: Int) : Reptile(id, name, age) {
    override fun crawl() {
        println("Snake $name is crawling")
    }

    override fun makeSound() {
        println("Snake $name makes a sound as : fis")
    }
}

class Zoopark() {
    var animalList = arrayListOf<Animal>()
    var zookeeperList = arrayListOf<Zookeeper>()

    fun addZookeeper(zookeeper:Zookeeper){
        zookeeperList.add(zookeeper)

    }


    fun addAnimal(animal: Animal) {
        animalList.add(animal)
        println("${animal.name} has added")
    }

    fun removeAnimal(animal: Animal) {

        var isAnimalFinded = false

        for (i in animalList) {
            if (i.id == animal.id) {
                isAnimalFinded  = true
                animalList.remove(animal)
                println("${animal.name} has removed")
                break
            }
        }

        if(!isAnimalFinded) {
            println("Bu heyvan movcud deyil!")
        }

    }
}

class Zookeeper(var name:String) {
    fun feedAnimal (array: ArrayList<Animal>){
        for (i in array){
            println(" ${i.name} yedizdirildi")
        }

    }
}

fun main(){

    var zoopark = Zoopark()
    var zookeeper =Zookeeper("Novruz")
    var cat = Cat(1, "bubu", 1)
    var snake = Snake(2, "mesdan", 1)
    var pigeon = Pigeon(3, "sirin", 1)
    zoopark.addAnimal(cat)
    zoopark.addAnimal(snake)
    zoopark.addAnimal(pigeon)
    zoopark.addZookeeper(zookeeper)

    zookeeper.feedAnimal(zoopark.animalList)

}
