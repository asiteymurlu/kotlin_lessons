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

class Note(var id: Int, var title: String, var content: String, var priorityValue: Int, var statusId: Int){

    fun info(){
        println(Note(id,title,content, priorityValue, statusId))
    }

    fun doneNote(){

    }
}

class NotesApp(){
    var notes = arrayListOf<Note>()
    fun addNote(note:Note){
        var isDublicatedNote = false

        for (i in notes ){
            if (i.id == note.id){
                isDublicatedNote = true
            }
        }
        if (isDublicatedNote == false){
            notes.add(note)
            println("Note has added")
        }else {
            println("Note is already exist")
        }
    }

    fun getAllNotes (){
        for (i in notes){
            println(i.content)
        }
    }

    fun getNotesDueToStatus(statusId1: Int){
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
}