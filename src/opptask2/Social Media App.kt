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
    var outbox = arrayListOf<Message>()
    var inbox = arrayListOf<Message>()


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

    fun sendMessage (message:Message, user: User){

        outbox.add(message)
        user.inbox.add(message)
        println("${message.user.username} sent to ${user.username}")

    }

    fun getInboxMessages(){
        inbox.forEach { it.info() }
    }

    fun getOutboxMessages(){
        outbox.forEach { it.info() }
    }

    fun likePost(post:Post){
        likedPosts.add(post)
        post.usersLikedPost.add(this)
        println("You liked this $post ")

    }
    fun unLikePost(post: Post){
        likedPosts.remove(post)
        post.usersLikedPost.remove(this)
        println("You unlike this $post")
    }

    fun showLikedPosts(){
        likedPosts.forEach { it.info() }
    }

    fun showFollowers(){
        followers.forEach { it.info() }
    }

    fun showFollowing(){
        following.forEach { it.info() }
    }
}

class Post (var id:Int, var title: String, var content: String,){
    var usersLikedPost = arrayListOf<User>()

    fun likedPostUsers (){
        usersLikedPost.forEach { it.info() }

    }

    fun countUsersLikedPost(){
       println("Postu like eden userlerin sayi : ${usersLikedPost.size}")
    }


    fun info(){
        println("Post(id=$id, title='$title', content='$content', usersLikedPost=$usersLikedPost)")
    }

}

class Message(var user : User, var text: String){
    fun info() {
        println("Message(username=${user.username}, text='$text')")
    }
}

fun main(){
    val socialNetwork = SocialNetwork()

    var user1 = User(1, "asi", "Asiman", "1234")
    var user2 = User(2, "asim", "Asi", "1234a")
    var user3 = User(3, "tamara", "Tamara", "1234b")

    socialNetwork.users.add(user1)
    socialNetwork.users.add(user2)
    socialNetwork.users.add(user3)

    var post1 = Post(10, "Equality", "Gender beraberliyi")
    var post2 = Post(11, "Sport", "Football")

    /*var message1 = Message(user1, " Salam" )
    user1.sendMessage(message1,user2)

    var message2 = Message(user1, " Necsesen" )

    user1.sendMessage(message2, user3)

    user1.getOutboxMessages()*/

    /*user1.sendFollowRequest(user3)
    user1.sendFollowRequest(user2)

    user1.showFollowing()
    user3.showFollowers()*/

    user3.likePost(post1)
    user3.likePost(post2)
    //user3.showLikedPosts()

    user2.likePost(post1)

    post1.likedPostUsers()
}