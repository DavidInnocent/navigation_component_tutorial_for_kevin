package com.david.navigation

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.navigation.findNavController

import com.david.navigation.R
import com.david.navigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

        lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        val registerBtn = view.findViewById<Button>(R.id.registerBtn)
        val registerBtn = binding.registerBtn
        val loginBtn = binding.login


        registerBtn.setOnClickListener {
            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomepageFragment())
        }

    }


}