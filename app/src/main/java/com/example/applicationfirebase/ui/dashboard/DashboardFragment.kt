package com.example.applicationfirebase.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.applicationfirebase.R
import com.example.applicationfirebase.databinding.FragmentDashboardBinding
import com.google.firebase.analytics.FirebaseAnalytics

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null
    private lateinit var mFirebaseAnalytics: FirebaseAnalytics
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
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
            mFirebaseAnalytics.logEvent("push_button_page_2_android", params)
            binding.textDashboard.text = "สำเร็จ"
        }
    }

    override fun onResume() {
        super.onResume()
        val bundle = Bundle()
        bundle.putString("name", "Nueng")
        bundle.putString("full_text", "Asadej")
        mFirebaseAnalytics.logEvent("page_2_android", bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}