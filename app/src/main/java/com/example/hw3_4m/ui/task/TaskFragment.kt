package com.example.hw3_4m.ui.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.hw3_4m.R
import com.example.hw3_4m.databinding.FragmentTaskBinding
import com.example.hw3_4m.ui.model.Task

class TaskFragment : Fragment() {

    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.doneBtn.setOnClickListener {
            val data = Task(
                title = binding.titleEt.text.toString(),
                desc = binding.descEt.text.toString()
            )
            setFragmentResult(TASK_RESULT_KEY, bundleOf(TASK_KEY to data))
            findNavController().navigateUp()
        }
    }

    companion object{
        const val TASK_RESULT_KEY = "task.result.key"
        const val TASK_KEY = "task.key"
    }
}