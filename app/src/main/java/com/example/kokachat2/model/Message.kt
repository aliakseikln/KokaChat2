package com.example.kokachat2.model

import android.content.Context
import com.example.kokachat2.util.formatAsHeader
import java.util.*

interface ChatEvent {
    val sentAt: Date
}

data class Message(
    val message: String = "",
    val senderId: String = "",
    val messageId: String = "",
    val type: String = "TEXT",
    val status: Int = 1,
    val liked: Boolean = false,
    override val sentAt: Date = Date()
) : ChatEvent

data class DateHeader(
    override val sentAt: Date = Date(),
    val context: Context
) : ChatEvent {
    val date: String = sentAt.formatAsHeader(context)
}