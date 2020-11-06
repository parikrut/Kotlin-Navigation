package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_titleFragment_to_gameFragment)
        }

        binding.aboutBtn.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_titleFragment_to_aboutFragment)
        }

        binding.rulesBtn.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_titleFragment_to_rulesFragment)
        }
        return binding.root
    }


}
