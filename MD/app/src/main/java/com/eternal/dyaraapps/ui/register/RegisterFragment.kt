package com.eternal.dyaraapps.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eternal.dyaraapps.R
import com.eternal.dyaraapps.databinding.FragmentRegisterBinding
import com.eternal.dyaraapps.databinding.FragmentStartBinding
import com.eternal.dyaraapps.ui.login.LoginFragment


class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAction()
    }

    private fun setupAction() {
        binding.apply {
            signUpButton.setOnClickListener {
                // Masuk ke login fragment
            }

            loginTextView.setOnClickListener {
                val parentFragmentManager = this@RegisterFragment.parentFragmentManager
                val mLoginFragment = LoginFragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, mLoginFragment, LoginFragment::class.java.simpleName)
                    .addToBackStack(null).commit()

            }
        }
    }

}