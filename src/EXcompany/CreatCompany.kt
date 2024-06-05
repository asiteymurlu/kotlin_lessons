package EXcompany

class Employee(var name: String, var surname: String, var age: Int, var working: Boolean) {

}

class Company(var companyName: String, var servicePrice:Int, var budget:Double) {
    val employeesList = arrayListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employeesList.add(employee)
    }

    }
}

fun main() {
    var company = Company("ABC Company", 10000, 1000000.0)


    company.employeesList
}