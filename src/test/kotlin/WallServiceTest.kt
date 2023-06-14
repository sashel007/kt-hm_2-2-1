import PostObjects.*
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val wallService = WallService()
        val attachments: Array<Attachment> = arrayOf(PhotoAttachment(Photo(1,1,"","")))
        val post = Post(
            20,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            true,
            Comment(),
            Like(),
            Copyright(),
            Repost(),
            View(),
            "",
            PostSource(),
            Geo(),
            1,
            copyHistory = arrayOf(1),
            true,
            true,
            true,
            true,
            true,
            true,
            Donut(),
            1,
            attachments = attachments
        )

        val addedPostResult = wallService.add(post)

        assertEquals(1,addedPostResult.id)
    }

    @Test
    fun update() {
        val wallService = WallService()
        val attachments: Array<Attachment> = arrayOf(PhotoAttachment(Photo(1,1,"","")))
        val post = Post(
            1,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            true,
            Comment(),
            Like(),
            Copyright(),
            Repost(),
            View(),
            "",
            PostSource(),
            Geo(),
            1,
            copyHistory = arrayOf(1),
            true,
            true,
            true,
            true,
            true,
            true,
            Donut(),
            1,
            attachments = attachments
        )
        wallService.add(post)
        // Изменяем пост с существующим id, ожидаем true
        val updatedPost1 = Post(
            1,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            true,
            Comment(),
            Like(),
            Copyright(),
            Repost(),
            View(),
            "",
            PostSource(),
            Geo(),
            1,
            copyHistory = arrayOf(1),
            true,
            true,
            true,
            true,
            true,
            true,
            Donut(),
            1,
            attachments = attachments
        )
        assertTrue(wallService.update(updatedPost1))

        // Изменяем пост с несуществующим id, ожидаем false
        val updatedPost2 = Post(
            2,
            1,
            1,
            1,
            1,
            "",
            1,
            1,
            true,
            Comment(),
            Like(),
            Copyright(),
            Repost(),
            View(),
            "",
            PostSource(),
            Geo(),
            1,
            copyHistory = arrayOf(1),
            true,
            true,
            true,
            true,
            true,
            true,
            Donut(),
            1,
            attachments = attachments
        )
        assertFalse(wallService.update(updatedPost2))
    }
}