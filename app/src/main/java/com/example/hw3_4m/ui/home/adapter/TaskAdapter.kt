package com.example.hw3_4m.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw3_4m.databinding.ItemTaskBinding
import com.example.hw3_4m.ui.model.Task

class TaskAdapter : Adapter<TaskAdapter.TaskViewHolder>() {

    private val list = arrayListOf<Task>()

    fun addTask(task: Task){
        list.add(task)
        notifyItemChanged(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            ItemTaskBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        return holder.bind(list[position])
    }

    fun setOnItemClickListener(any: Any) {


    }

    inner class TaskViewHolder(private var binding: ItemTaskBinding) : ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.titleTv.text = task.title
            binding.descTv.text = task.desc
        }
    }
}