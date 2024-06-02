package EXcompany

open class Company (var nameOfCompany:String, var servicePrice:Int, var employeesList: String, var budget:Double) {
    fun runemployeesList(){

    }
    fun lookUpEmployee(name:String){
        for (name in employeesList){
            println("$name movcuddur")
        }
    }

    fun paySalary(){

    }
    fun dismiss(){

    }

    fun hiring(){

    }
}
Metodlari:
1) Iscilerin siyahisini ekrana yazdir (Yan yana vergul ile)
2) Istenilen iscini axtarmaq, adina ve ya soyadina gore, eger isci varsa hemin iscileri print etmek, yoxdusa isci tapilmadi print etmek
3) Iscilerin maasin ver metodu, umumi budceden butun iscilerin maasin cixsin, yekun budceni ekrana yazdirsin. Budce menfide ola biler.

4) Iscini isden cixarmaq, iscinin id sine gore axtaris edib iscini tapmaq ve isden cixarmaq.

5) Isci ise goturmek, siyahiya yeni isci elave etmek.

class Employee(var name:String, var surname:String, var age:Int, var salary:Int, var working: Boolean){

    fun info(){

   }
    fun iseBasla(){

    }
    fun isiSonlandir(){

    }

}

class Director{
    fun sikayeteBax(name:Employee, lastname:Employee, sikayetMetni:String){

    }
}
class Manager{

}
class Worker{

    fun directoraSikayetEt(sikayetMetni:String, director:Director){

    }

}
interface AllowToRemoteWorking {

}
interface NotAllowToRemoteWorking{

}