package com.rm.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.rm.todocompose.ui.theme.HighPriorityColor
import com.rm.todocompose.ui.theme.LowPriorityColor
import com.rm.todocompose.ui.theme.MediumPriorityColor
import com.rm.todocompose.ui.theme.NonePriorityColor

enum class Priority(color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}