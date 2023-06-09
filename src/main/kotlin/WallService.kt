class WallService {

    private val posts = mutableListOf<Post>()
    private var currentId = 1

    fun add(post: Post): Post {
        val newPost = post.copy(id = currentId)
        posts.add(newPost)
        currentId++
        return newPost
    }

    fun update(post: Post): Boolean {
        val existingPost = posts.find {
            it.id == add(post).id
        }
        return if(existingPost != null) {
            val index = posts.indexOf(existingPost)
            post[index] = post
            true
        } else {
            false
        }
    }
}