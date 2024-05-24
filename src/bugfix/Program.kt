package bugfix

class Program(var nameOfproqram: String)


class Ram(mb: Int)

class Computer(var diskType: String, var operatingSytem: String, var isPowerOn: Boolean) {

    //var ram: Ram? = Ram(512)

    var runningProgram: Program? = null


    var programList = arrayListOf<Program>()


    fun addPrograms() {

        programList.add(Program("Zoom"))
        programList.add(Program("Word"))
        programList.add(Program("Visio"))

    }


    fun powerOnOf() {
        //isPowerOn = !isPowerOn

        if(isPowerOn == true) {
            isPowerOn = false
        } else {
            isPowerOn = true
        }

        if(isPowerOn) {
            println("Power on computer ")
        } else {
            println("Power off computer")
        }
    }

    fun enterProgram(name:String) {
        for (i in programList ) {

            if (i.nameOfproqram == name) {
                runningProgram = i
                break
            } else {
                runningProgram = null
            }
        }

        if(runningProgram == null) {
            println("Bu proqram movcud deyil!")
        } else {
            println("${runningProgram!!.nameOfproqram} proqramina daxil oldu! ")
        }

    }

    fun determineProgram(): Program? {
        return runningProgram
    }
}


fun main() {

    var comp = Computer( "SSD", "Linux", false)


    comp.powerOnOf()

    comp.addPrograms()

    println("Running program: ${comp.determineProgram()}")


    comp.enterProgram("crhome")


    //var program1 = Program("")
}