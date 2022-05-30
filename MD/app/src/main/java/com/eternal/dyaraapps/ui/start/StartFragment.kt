package com.eternal.dyaraapps.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eternal.dyaraapps.R
import com.eternal.dyaraapps.databinding.FragmentStartBinding
import com.eternal.dyaraapps.ui.login.LoginFragment
import com.eternal.dyaraapps.ui.register.RegisterFragment

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAction()
    }

    private fun setupAction() {
        val parentFragmentManager = this.parentFragmentManager
        binding.apply {
            btnLogin.setOnClickListener {
                val mLoginFragment = LoginFragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, mLoginFragment, LoginFragment::class.java.simpleName)
                    .addToBackStack(null).commit()
            }

            btnRegister.setOnClickListener {
                val mRegisterFragment = RegisterFragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, mRegisterFragment, RegisterFragment::class.java.simpleName)
                    .addToBackStack(null).commit()
            }
        }
    }

}