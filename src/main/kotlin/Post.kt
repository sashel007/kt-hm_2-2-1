import PostObjects.*

data class Post(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int?,
    var friendsOnly: Boolean,
    var comments: Comment,
    var likes: Like,
    var copyright: Copyright,
    var reposts: Repost,
    var views: View,
    var postType: String?,
    var postSource: PostSource,
    var geo: Geo,
    var signerId: Int,
    var copyHistory: Array<Int>,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavourite: Boolean,
    var donut: Donut,
    var posponedId: Int,
    val attachments: Array<Attachment>
    ) {
    operator fun set(index: Int, value: Post) {

    }
}