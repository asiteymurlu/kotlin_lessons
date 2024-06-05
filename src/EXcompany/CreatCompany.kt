package EXcompany

open class Employee(var id: Int, var name: String, var surname: String, var age: Int, var working: Boolean) {
    var salary = 1000


    fun startWork(){
        working = true
    }
    fun finishWork(){
        working = false
    }

    open fun info(){
        println("Adi: $name, Soyadi: $surname, Yasi: $age, hazirda isleyir: $working ")
    }

}

class Director(id: Int, name: String,surname: String,age: Int, working: Boolean):Employee(id, name, surname,age, working), AllowToRemoteWorking {
    override fun isAllowToRemoteWorking(): Boolean {
        return true
    }

    override fun info() {
        super.info()
        println("Iscinin vezifesi direktordur.")
    }

    fun sikayeteBax(worker: Worker, sikayetMetni:String){

    }
}
class Manager(id: Int, name: String,surname: String,age: Int, working: Boolean):Employee(id, name, surname,age, working), AllowToRemoteWorking{
    override fun isAllowToRemoteWorking(): Boolean {
        return true
    }
    override fun info() {
        super.info()
        println("Iscinin vezifesi menecerdi.")
    }
}

class Worker(id: Int, name: String,surname: String,age: Int, working: Boolean):Employee(id, name, surname,age, working), AllowToRemoteWorking{
    override fun isAllowToRemoteWorking(): Boolean {
        return false
    }
    override fun info() {
        super.info()
        println("Iscinin vezifesi fehledir.")
    }

    fun directoraSikayetEt(sikayetMetni:String, director:Director){
        director.sikayeteBax(this, sikayetMetni)
    }
}
class Company(var companyName: String, var servicePrice:Int, var budget:Double) {
    val employeesList = arrayListOf<Employee>()

    fun addEmployee(employee: Employee) {
        var isDublicatedEmployee = false

        for (i in employeesList ){
            if (i.id == employee.id){
                isDublicatedEmployee = true
            }

        }
          if (isDublicatedEmployee == false){
              employeesList.add(employee)
              println("Bu istifadeci eleve olundu")
          }else {

              println("Istifadeci artiq movcuddur")
          }

    }


    fun fireEmployee(employee: Employee){
        var isEmployeeExist = false

        for (i in employeesList){
            if (i.id == employee.id){
                isEmployeeExist = true
            }
        }
        if (isEmployeeExist == true){
            employeesList.remove(employee)
        } else {
            println("Bele isci tapilmadi")
        }
    }

    fun showAllEmployeesInfo(){
        for(i in employeesList){
            i.info()
            println("*****************************")
            //print("${i.name} , ")
        }

    }

    fun findEmployee(nameOrSurname:String){
        for (i in employeesList){
            if (i.name == nameOrSurname ||  i.surname == nameOrSurname){
                println("Isci: ${i.name} ${i.surname}")
            } else {
                println("Isci tapilmadi")
            }
        }
    }

}

fun main() {
    var company = Company("ABC Company", 10000, 1000000.0)


    company.employeesList
}


interface AllowToRemoteWorking {
    fun isAllowToRemoteWorking(): Boolean
}