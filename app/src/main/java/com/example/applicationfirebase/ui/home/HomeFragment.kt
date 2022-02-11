package com.example.applicationfirebase.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.applicationfirebase.R
import com.example.applicationfirebase.databinding.FragmentHomeBinding
import com.google.firebase.analytics.FirebaseAnalytics

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private lateinit var mFirebaseAnalytics: FirebaseAnalytics

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        setViewData()
        return root
    }

    private fun setViewData() {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(requireContext())

        binding.button.setOnClickListener {
            val params = Bundle()
            params.putString("image_name", "android.png")
            params.putString("full_text", "Android 7.0 Nougat")
            mFirebaseAnalytics.logEvent("push_button_page_1_android", params)
            binding.textHome.text = "สำเร็จ"
        }
    }

    override fun onResume() {
        super.onResume()
        val bundle = Bundle()
        bundle.putString("name", "Nueng")
        bundle.putString("full_text", "Asadej")
        mFirebaseAnalytics.logEvent("page_1_android", bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}