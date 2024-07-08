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

open class SocialNetwork {

    var users = arrayListOf<User>()
    var posts = arrayListOf<Post>()
}
class User (var id: Int, var username : String, var name: String, var password: String){
    var followers = arrayListOf<SocialNetwork>()
    var following = arrayListOf<SocialNetwork>()
    var likedPosts = arrayListOf<Post>()
}

class Post (var id:Int, var title: String, var content: String,){
    var usersLikedPost = arrayListOf<User>()

    fun likedPostUsers (){
        for (i in use)

    }

}