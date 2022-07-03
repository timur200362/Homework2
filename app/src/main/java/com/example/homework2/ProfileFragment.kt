package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentMusicBinding
import com.example.homework2.databinding.ProfileFragmentBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment:Fragment(R.layout.profile_fragment) {
    private var _binding: ProfileFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = ProfileFragmentBinding.bind(view)

        with(binding) {
            btnProfile.setOnClickListener {
                findNavController().navigate(
                    R.id.action_profileFragment_to_mainFragment,
                    MainFragment.createBundle(textView3.text.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}