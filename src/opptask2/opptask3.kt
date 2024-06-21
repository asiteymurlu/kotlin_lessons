package opptask2

/*class Book (var id: Int, var name: String, var content: String ) {

    fun info() {
        println("ID: $id, Title: $name, content: $content")
    }
}

class Library() {
    private var books = arrayListOf<Book>()


    fun addBook(book: Book) {
        var dublicatedBook = false

        for (i in books) {
            if (i.id == book.id) {
                dublicatedBook = true
            }
        }
        if (dublicatedBook == false) {
            books.add (book)
            println("Note has added")
        } else {
            println("Note is already exist")
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
    } }*/




class App (){

}
class SystemApp(){

}
class Phone (){
    var programs = arrayListOf<App>()
    private var systenPrograms = arrayListOf<SystemApp>()
}