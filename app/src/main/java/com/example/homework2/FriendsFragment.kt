package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentFriendsBinding
import com.example.homework2.databinding.FragmentMusicBinding

class FriendsFragment:Fragment(R.layout.fragment_friends) {
    private var _binding: FragmentFriendsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFriendsBinding.bind(view)

        with(binding) {
            btnFriends.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment_to_mainFragment,
                    MainFragment.createBundle(textView5.text.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}