class WallService {

    private var posts = arrayListOf<Post>()
    private var comments = emptyArray<Comment>()
    private var currentId = 1

    fun addPost(post: Post): Post {
        val newPost = post.copy(id = currentId)
        posts.add(newPost)
        currentId++
        return newPost
    }

    fun updatePost(post: Post): Boolean {
        val existingPost = posts.find {
            it.id == post.id
        }
        return if(existingPost != null) {
            val index = posts.indexOf(existingPost)
            posts[index] = post.copy()
            true
        } else {
            false
        }
    }

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
