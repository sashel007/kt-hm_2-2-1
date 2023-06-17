class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(postId: Int, comment: Comment): Comment {
        val post = posts.find { it.id == postId}
        if (post != null) {
            val newComment = comment.copy()
            comments += newComment
            return newComment
        } else {
            throw PostNotFoundException("Post with ID $postId not found")
        }
    }

    class PostNotFoundException(message: String) : Exception(message)
}
