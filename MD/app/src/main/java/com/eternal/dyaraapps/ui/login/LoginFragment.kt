package com.eternal.dyaraapps.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eternal.dyaraapps.R
import com.eternal.dyaraapps.databinding.FragmentLoginBinding
import com.eternal.dyaraapps.databinding.FragmentRegisterBinding
import com.eternal.dyaraapps.ui.mainactivity.MainActivity
import com.eternal.dyaraapps.ui.register.RegisterFragment

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAction()
    }

    private fun setupAction() {
        binding.apply {
            loginButton.setOnClickListener {
                // Masuk ke home
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }

            registerTextView.setOnClickListener {
                val parentFragmentManager = this@LoginFragment.parentFragmentManager
                val mRegisterFragment = RegisterFragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, mRegisterFragment, RegisterFragment::class.java.simpleName)
                    .addToBackStack(null).commit()
            }
        }
    }
}