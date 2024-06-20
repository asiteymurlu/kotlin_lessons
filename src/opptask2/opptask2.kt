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

class Note(var id: Int, var title: String, var content: String, var priorityValue: Int, var statusId: Boolean) {

    fun info() {
        println("ID: $id, Title: $title, content: $content")
    }

    /*fun doneNote() {

        statusId = true
        println("Note has done")

    }*/
}

class NotesApp() {
    var notes = arrayListOf<Note>()


    fun addNote(note: Note) {
        var dublicatedNote = false

        for (i in notes) {
            if (i.id == note.id) {
                dublicatedNote = true
            }
        }
        if (dublicatedNote == false) {
            notes.add(note)
            println("Note has added")
        } else {
            println("Note is already exist")
        }
    }

    fun removeNote(note: Note) {
        var isNoteFound = false

        for (i in notes) {
            if (i.id == note.id) {
                isNoteFound = true
            }
        }
        if (isNoteFound == true) {
            notes.remove(note)
            println("Note has removed")
        } else {
            println("Note note found")
        }
    }

    fun getAllNotes() {
        for (i in notes) {
            i.info()
            println("------------------------------")
        }
    }

    fun getNotesDueToStatus(statusId1: Boolean) {

        var notesByStatus = arrayListOf<Note>()

        for (i in notes) {
            if (i.statusId == statusId1) {
                notesByStatus.add(i)
            }
        }


        if(notesByStatus.isEmpty()) {
            println("Notes not found")
        } else {
            for(i in notesByStatus) {
                i.info()
            }
        }
    }

    fun getNotesDueToPriority(priority: Int) {
        var notesByPriority = arrayListOf<Note>()

        for (i in notes) {
            if (i.priorityValue == priority) {
                notesByPriority.add(i)
            }
        }


        if(notesByPriority.isEmpty()) {
            println("Notes not found")
        } else {
            for(i in notesByPriority) {
                i.info()
            }
        }
    }

    fun foundNote(query: String) {
        var notesByQuery = arrayListOf<Note>()

        for (i in notes) {

            println("TEST TITLE: ${i.title} ---- TEST QUERY: $query")

            if (i.title.toLowerCase().contains(query.toLowerCase())) {
                notesByQuery.add(i)
            }
        }


        if(notesByQuery.isEmpty()) {
            println("Notes not found")
        } else {
            for(i in notesByQuery) {
                i.info()
            }
        }
    }

    fun changeNote(id: Int, title: String, content: String) {

        var isNoteFound = false
        var note: Note? = null

        for (i in notes) {
            if (i.id == id) {
                isNoteFound = true
                note = i
            }
        }
        if (isNoteFound) {
            note?.title = title
            note?.content = content
            println("Note has changed")
        } else {
            println("Note note found")
        }


        /*for (i in notes) {
            if (i.id == note.id) {
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
        }*/
    }

    fun noteDone(note: Note) {
        note.statusId = true
    }
}

fun main() {

    val note1 = Note(1, "Qeyd", "Kompter", 1, true)
    val note2 = Note(2, "Asiman", "Kompter", 3, false)
    val note3 = Note(3, "Novruz", "Nokia", 2, false)
    val note4 = Note(4, "Tamara", "", 2, false)
    val note5 = Note(5, "Murad", "Islemir", 1, true)
    val note6 = Note(6, "Iphone", "Telefon", 3, false)

    val notesApp = NotesApp()
    notesApp.addNote(note1)
    notesApp.addNote(note2)
    notesApp.addNote(note3)
    notesApp.addNote(note4)
    notesApp.addNote(note5)
    notesApp.addNote(note6)


    notesApp.changeNote(4,"Tomi", "Samsung")

    //note4.info()

    //notesApp.removeNote(note6)
    //notesApp.getAllNotes()
    //notesApp.removeNote(note3)

    //notesApp.foundNote("N")

    notesApp.noteDone(note6)
    notesApp.getNotesDueToStatus(true)
}