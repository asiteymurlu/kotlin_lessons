package opptask2

/*1) Sade sosial sebeke proqrami yazin, icinde istifadeciler olsun, bir birlerini follow ede bilsinler,
bir birlerine mesaj gondere bilsinler, postlara baxa bilsinler postlari beyene bilsinler.

* SocialNetwork sinifi
Deyerler:
1) Userlerin siyahisi
2) Postlarin siyahisi

*Metodlar:
1) Her hansisa useri axtarmaq (username gore)
2) Postlari axtarmaq (title gore) (listde ola biler netice)
3) user silmek (idye gore)
4) post silmek (idye gore)
5) daxilOlmetodu(User user)

User sinifi

Deyerler:
1) follow etdiyim userler
2) meni follow eden userler
3) Like etdiyim postlar
4) username
5) ad
6) password
7) id

Metodlar
1) her hansisa useri follow etmek
2) her hansisa userden follow qebul elemek
3) usere mesaj yollamaq
4) userden mesaj qebul elemek
5) postu like etmek
6) postu unlike etmek
7) like elediyim postlarin siyahisi
8) followerlerin siyahisi
9 followlarin siyahisi

Post sinifi
*Deyerler
1) id
2) title
3) content
4) postu beyenen userler

*Metodlar
1) postu beyenen userlerin siyahisi
2) beyenenlerin sayi */
class SocialNetwork( ) {

    var users = arrayListOf<User>()
    var posts = arrayListOf<Post>()

    fun searchUser (username: String) {

        var userExist = false
        var user: User? = null

        for (i in users){
            if (i.username == username){
                userExist = true
                user = i

            }
        }


        if(userExist){
            user!!.info()
        } else {
            println("$username istifadecisi movcud deyil")
        }
    }

    fun searchPost (title:String){
        val searchingPost = arrayListOf<Post>()

        for (i in posts){
            if (i.title == title){
                searchingPost.add(i)
            }
        }
        searchingPost.forEach { it.info() }
    }

    fun deleteUser(id: Int){
        for (i in users){
            if (i.id == id){
                users.remove(i)
            }
        }
    }

    fun deletePost(id: Int){
        for (i in posts){
            if (i.id == id){
                posts.remove(i)
            }
        }
    }

    fun login(user: User){

        var isLogged = false

        for (i in users){
            if (i.username == user.username && i.password == user.password ) {
                isLogged = true
            }
        }

        if(isLogged){
            println("${user.name} dail oldu")
        } else {
            println(" istifadeci adi ve ya sifre yanlisdir")
        }

    }
}
class User (var id: Int, var username : String, var name: String, var password: String){
    var followers = arrayListOf<User>()
    var following = arrayListOf<User>()
    var likedPosts = arrayListOf<Post>()

    fun info(){
        println("User id: $id, username: $username, name: $name, password: $password ")
    }

    fun printFollowers(){
        println("$username - Followers: ")
        for (i in followers){
            i.info()
            println("*********************************************")
        }
    }
    fun printFollowing(){
        println("$username - Following: ")
        for (i in following){
            i.info()
            println("**********************************************************")
        }
    }

    fun acceptFollow (newfollower:User){
        followers.add(newfollower)
        newfollower.following.add(this)
        println("${newfollower.username} has added")
    }

    fun sendFollowRequest (user: User){
        following.add(user)
        user.followers.add(this)
        println("${user.username} is following")

    }

    fun sendMessage (message:String, user: User){
        var outbox = arrayListOf<String>()
        outbox.add(message)
        println("$message sent to $user")

    }

    fun getMessage(message: String, user: User){
        var inbox = arrayListOf<String>()
        inbox.add(message)
        println("You have a message from $user")
    }


}

class Post (var id:Int, var title: String, var content: String,){
    var usersLikedPost = arrayListOf<User>()

    fun likedPostUsers (){
        for (i in )

    }

    fun info(){
        println("Post(id=$id, title='$title', content='$content', usersLikedPost=$usersLikedPost)")
    }


}