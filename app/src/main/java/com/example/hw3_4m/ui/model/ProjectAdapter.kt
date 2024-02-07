package com.example.hw3_4m.ui.model

import androidx.room.Embedded
import androidx.room.Relation
import com.example.hw3_4m.ui.model.Task

data class ProjectAndTasks (
    @Embedded val project: Project,
    @Relation(
        parentColumn = "project_id",
        entityColumn = "primary_key"
    )
    val tasks: List<Task>
)