package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentGroupsBinding
import com.example.homework2.databinding.FragmentMusicBinding

class GroupsFragment:Fragment(R.layout.fragment_groups) {
    private var _binding: FragmentGroupsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGroupsBinding.bind(view)

        with(binding) {
            btnGroups.setOnClickListener {
                findNavController().navigate(
                    R.id.action_groupsFragment_to_mainFragment,
                    MainFragment.createBundle(textView4.text.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}