package com.example.firsttry.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.firsttry.MainActivity
import com.example.firsttry.R
import com.example.firsttry.common.appViewModels
import com.example.firsttry.databinding.FragmentPersonInfoBinding
import com.example.firsttry.databinding.RickListRowBinding
import java.net.IDN


class ProfileFragment : Fragment() {
    var IdChar: Int = 0

    private val viewModel by appViewModels {
        ProfileViewModel(
            profileId = IdChar
        )
    }
    lateinit var fragmentBinding: FragmentPersonInfoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_person_info, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.user.observe(viewLifecycleOwner) { user ->
            fragmentBinding = FragmentPersonInfoBinding.bind(view)

            fragmentBinding.ID.text = user?.id.toString()
            fragmentBinding.NameChar.text = user?.name.toString()
            fragmentBinding.Status.text = user?.status.toString()
            fragmentBinding.Species.text = user?.species.toString()
            fragmentBinding.Type.text = user?.type.toString()
            fragmentBinding.Gender.text = user?.gender.toString()
            fragmentBinding.NameOrigin.text = user?.origin?.name.toString()
            fragmentBinding.UrlOrigin.text = user?.origin?.url.toString()
            fragmentBinding.NameLocation.text = user?.location?.name.toString()
            fragmentBinding.UrlLocation.text = user?.location?.url.toString()
           // fragmentBinding.episode.text = user?.episode.toString()
            fragmentBinding.image.text = user?.image.toString()
            fragmentBinding.url.text = user?.url.toString()
            fragmentBinding.Created.text = user?.created.toString()

        }
    }

    companion object {
        fun get(userId: Int): ProfileFragment {

            val  fragment = ProfileFragment()

            fragment.arguments = Bundle().also {
                it.putInt("id", userId)
                fragment.IdChar = userId
            }

            return fragment
        }
    }

}
