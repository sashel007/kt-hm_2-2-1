import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val wallService = WallService()
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
            "",
            Comment(),
            Like()
        )
        val addedPostResult = wallService.add(post)

        assertEquals(1,addedPostResult.id)
    }

    @Test
    fun update() {
        val wallService = WallService()
        val post = Post(
            1,
            1,
            1,
            1,
            123456789,
            "Test post",
            0,
            0,
            false,
            "",
            Comment(),
            Like()
        )
        wallService.add(post)

        // Изменяем пост с существующим id, ожидаем true
        val updatedPost1 = Post(
            1,
            1,
            1,
            1,
            123456789,
            "Updated post",
            0,
            0,
            false,
            "",
            Comment(),
            Like()
        )
        assertTrue(wallService.update(updatedPost1))
    }

    @Test
    fun update2() {
        val wallService = WallService()
        val post = Post(
            1,
            1,
            1,
            1,
            123456789,
            "Test post",
            0,
            0,
            false,
            "",
            Comment(),
            Like()
        )
        wallService.add(post)
        // Изменяем пост с несуществующим id, ожидаем false
        val updatedPost2 = Post(
            2,
            2,
            2,
            2,
            123456789,
            "Updated post",
            0,
            0,
            false,
            "",
            Comment(),
            Like()
        )
        assertFalse(wallService.update(updatedPost2))
    }
}