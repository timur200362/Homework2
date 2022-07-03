package InformationAboutSong

class Song (
    val IdMusic:Int,
    val NameAuthor:String,
    val URL:String="",
    val Description:String
)
{override fun toString(): String{
    return "Author:$NameAuthor Duration:$Description"}}