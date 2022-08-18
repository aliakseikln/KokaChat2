package com.example.kokachat2.util

import android.app.Dialog
import android.content.Context
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.kokachat2.R
import com.example.kokachat2.login.loginFragment.TAG

private lateinit var dialog: Dialog

fun showLoadingDialog(context: Context, message: String) {
    dialog = Dialog(context)
    dialog.apply {
        setCancelable(false)
        setContentView(R.layout.loading_dialog)
        val loadingMessage = findViewById<TextView>(R.id.tvLoading)
        loadingMessage.text = message
        dialog.show()
    }
}

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}


fun dismissDialogBox() {
    Log.d(TAG, "trying to dismiss")
    dialog.dismiss()
}