package com.example.kokachat2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kokachat2.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.firebase.auth.FirebaseAuth
import com.example.kokachat2.chat.ChatActivity
import com.example.kokachat2.login.LoginActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val auth by lazy { FirebaseAuth.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTermsAndCondition.setOnClickListener {
            showCreatorDialog()
        }

        if (auth.currentUser != null){
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnStartMessage.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun showCreatorDialog() {
        val bottomSheet = BottomSheetDialog(this)
        bottomSheet.setContentView(R.layout.bottom_sheet_dailog)
        bottomSheet.show()
    }
}