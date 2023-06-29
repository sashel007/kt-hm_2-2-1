import PostObjects.*
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun shouldCreateCommentForExistingPost() {
        val wallService = WallService()
        val postId = 1

        val attachment: Attachment = PhotoAttachment(Photo(1,1,"",""))
        val attachments: Array<Attachment> = arrayOf(attachment)
        val parrentStackArray = arrayOf(1)
        val comment = Comment(
            1,
            1,
            1,
            "First Post",
            Donut(),
            1,
            1,
            attachments,
            parrentsStack = parrentStackArray,
            Thread()
        )

        val post = Post(
            postId,
            1,
            1,
            1,
            123456789,
            "Some post text",
            0,
            null,
            false,
            comment,
            Like(),
            Copyright(),
            Repost(),
            View(),
            "post",
            PostSource(),
            Geo(),
            0,
            emptyArray(),
            true,
            true,
            true,
            false,
            false,
            false,
            Donut(),
            0,
            emptyArray()
        )
        wallService.addPost(post)

        val createdComment = wallService.createComment(postId, comment)

        assertEquals(comment, createdComment) // Проверяем, что возвращенный комментарий совпадает с созданным

    }

    @Test(expected = WallService.PostNotFoundException::class)
    fun checkException() {
        val wallService = WallService()
        val postId = 1
        val attachment: Attachment = PhotoAttachment(Photo(1,1,"",""))
        val attachments: Array<Attachment> = arrayOf(attachment)
        val parrentStackArray = arrayOf(1)
        val comment = Comment(
            2,
            1,
            1,
            "First Post",
            Donut(),
            1,
            1,
            attachments,
            parrentsStack = parrentStackArray,
            Thread()
        )

        wallService.createComment(postId, comment) // Вызываем функцию, ожидая выбрасывания исключения
    }

}