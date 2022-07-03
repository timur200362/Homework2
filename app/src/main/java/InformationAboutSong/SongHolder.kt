package InformationAboutSong

import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.MusicFragment
import com.example.homework2.databinding.ItemMusicBinding

class SongHolder(
    private val binding: ItemMusicBinding,
    private val onItemClick: ((Song) -> Unit)?
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(song: Song) {
        with(binding) {
            tvAuthor.text = song.NameAuthor
            root.setOnClickListener{
                onItemClick?.invoke(song)
            }
        }
    }
}