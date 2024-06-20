package opptask2

/* 1) Bir eded NotesApp sinifimiz olsun. Bu sinifimizin icinde Note tipinde elementleri olan notelarin siyahisi
olsun. Siyahiya yeni note elave ede bilsin, siyahidan istediyi notu sile bilsin, butun notelari ekrana yazdira
bilsin, gozlemede olan ve bitmis notelari gostersin, notelari priority gore gosterin. Bir note done ede bilsin.

statusId: pending = 1, done = 2
priority: low = 0, medium = 1, high = 2

Note sinifi:
1) Deyerler: id, title, content, priorityValue, statusId

2) Funksialar: info(), doneNote()

NotesApp sinifi
1) deyerler: Note larin siyahisi

2) Metodlar:
butunNotelariEKranaYazdir(),
notlariStatusaGoreGoster(statusId),
notlariPriorityGoreGoster(priority: Int),
herHansisaNoteAxtar(query: String) (Note axtarma title gore olsun),
noteDoneEt(note: Note),
noteElaveEt(note: Note),
noteSil(note: Note)
noteDeyisdir(id, title, content) (Bu metod id ye gore note axtarsin eger varsa hemin notu metodda verilen
 deyerlere gore deyisdirsin, yoxdusa note tapilmadi yazsin) */

class Note(var id: Int, var title: String, var content: String, var priorityValue: Int, var statusId: Boolean){

    fun info(){
        println(Note(id,title,content, priorityValue, statusId))
    }

    fun doneNote(newStatusId:Boolean){
    var statusId = false
        if (statusId == true){
            println("Note has done")
        }
    }
}

class NotesApp(){
    var notes = arrayListOf<Note>()


    fun addNote(note:Note){
        var dublicatedNote = false

        for (i in notes ){
            if (i.id == note.id){
                dublicatedNote = true
            }
        }
        if (dublicatedNote == false){
            notes.add(note)
            println("Note has added")
        }else {
            println("Note is already exist")
        }
    }
    fun removeNote(note: Note){
        var isDublicatedNote = false

        for (i in notes ){
            if (i.id == note.id){
                isDublicatedNote = true
            }
        }
        if (isDublicatedNote == true){
            notes.remove(note)
            println("Note has removed")
        }else {
            println("Note is already exist")
        }
    }
    fun getAllNotes (){
        for (i in notes){
            i.info()
            println("------------------------------")
        }
    }

    fun getNotesDueToStatus(statusId1: Boolean){
        for (i in notes){
            if (i.statusId == statusId1){
                println(i.title)
            } else
            {
                println("Not found")
            }
        }
    }
    fun getNotesDueToPriority(priority: Int){
        for(i in notes){
            if (i.priorityValue == priority){
                println(i.title)
            } else {
                println("Not found")
            }
        }
    }
    fun foundNote(query:String){
        for (i in notes){
            if (i.title == query){
                println(i.title)
            } else {
                println("Note found")
            }
        }
    }

    fun changeNote(note: Note){
        for (i in notes){
            if (i.id == note.id){
                println("Enter new credentials: id, title and content")
                var newid = readLine()!!.toInt()
                var newtitle = readLine()!!.toString()
                var newcontent = readLine()!!.toString()
                i.id = newid
                i.title = newtitle
                i.content = newcontent
            println("Note changed succesfully: ${i.id}   ${i.title}   ${i.content}")
            } else {
                println("Note found")
            }
        }
    }

    fun noteDone(note: Note){
        note.statusId = true
    }
}