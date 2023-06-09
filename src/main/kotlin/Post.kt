data class Post(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var postType: String,
    var comments: Comment,
    var likes: Like,
) {
    operator fun set(index: Int, value: Post) {

    }
}