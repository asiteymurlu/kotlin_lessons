package opptask2

/*
class Book (var id: Int, var name: String, var content: String ) {

    fun info() {
        println("ID: $id, Title: $name, content: $content")
    }
}

class Library() {
    private var books = arrayListOf<Book>()

    fun getBooks () : ArrayList<Book> {
        return books
    }
    fun addBook(book: Book) {
        var dublicatedBook = false

        for (i in books) {
            if (i.id == book.id) {
                dublicatedBook = true
            }
        }
        if (dublicatedBook == false) {
            books.add (book)
            println("Book has added")
        } else {
            println("Book is already exist")
        }
    }

    fun removeBook(book: Book) {
        var isNoteFound = false

        for (i in books) {
            if (i.id == book.id) {
                isNoteFound = true
            }
        }
        if (isNoteFound == true) {
            books.remove(book)
            println("Book has removed")
        } else {
            println("Book not found")
        }
    } }

fun main(){
    var book = Book(1, "Tomun serguzestleri", "Adventure")
    var book1 = Book(2, "Tom", "Dram")
    var library = Library()
    library.addBook(book)
    library.addBook(book1)
     // book.info()

       for (i in library.getBooks()) {
           i.info()
       }
}
*/



class App() {

}

class SystemApp(private var name: String, private var size: Int) {
    fun getName(): String {
        return name
    }

    fun getSize(): Int {
        return size
    }
}

class Phone() {
    var programs = arrayListOf<App>()
    private var systemPrograms = arrayListOf<SystemApp>()

    fun getSystemPrograms(): ArrayList<SystemApp> {
        return systemPrograms
    }
}
