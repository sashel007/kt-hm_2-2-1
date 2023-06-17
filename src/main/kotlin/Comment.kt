import PostObjects.Attachment
import PostObjects.Donut
import PostObjects.Thread

data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Array<Attachment>,
    val parrentsStack: Array<Int>,
    val thread: Thread
) {


}
