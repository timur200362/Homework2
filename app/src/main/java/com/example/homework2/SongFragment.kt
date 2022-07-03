package com.example.homework2
import InformationAboutSong.SongRepository
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.R
import com.example.homework2.databinding.ItemMusicBinding

class SongInfFragment : Fragment(R.layout.fragment_song) {

    private var _binding: SongInfFragment? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=SongInfFragment.bind(view)

        val text = arguments?.getString(ARG_TEXT).orEmpty()
        if (text.isNotEmpty()) {
            binding.tv_songInf = "${SongRepository.songs[text.toInt()].toString()}"
        }

        with(binding) {
            btnBack.setOnClickListener {
                findNavController().navigate(
                    R.id.action_songInfFragment_to_musicFragment
                )
            }
        }
    }

    companion object {

        private const val ARG_TEXT = "id"

        fun createBundle(text: String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT,
                text
            )
            return bundle
        }
    }
}
