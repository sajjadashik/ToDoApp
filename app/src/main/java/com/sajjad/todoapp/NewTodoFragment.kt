package com.sajjad.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sajjad.todoapp.databinding.FragmentNewTodoBinding

class NewTodoFragment : Fragment() {
    private lateinit var binding: FragmentNewTodoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewTodoBinding.inflate(inflater,container,false)
        return binding.root
    }

}