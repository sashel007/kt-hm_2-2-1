package PostObjects

interface Attachment  {
    val type: String
}

data class PhotoAttachment(val photo: Photo) : Attachment {
    override val type: String = "photo"
}

data class PostedPhotoAttachment(val postedPhoto: PostedPhoto) : Attachment {
    override val type: String = "posted_photo"
}

data class VideoAttachment(val video: Video) : Attachment {
    override val type: String = "video"
}

data class AudioAttachment(val audio: Audio) : Attachment {
    override val type: String = "audio"
}

data class DocumentAttachment(val document: Document) : Attachment {
    override val type: String = "document"
}



data class Photo(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)
data class PostedPhoto(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)
data class Video(val id: Int, val ownerId: Int, val title: String, val duration: Int)
data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHq: Boolean
)
data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int,
    val preview: Preview
)
class Preview()



