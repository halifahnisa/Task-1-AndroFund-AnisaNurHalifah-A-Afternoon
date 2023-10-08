package com.example.tugas1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.MainThread

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var  history:TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        if(result.resultCode == Activity.RESULT_OK){
            val  data:Intent? = result.data
            val returnString:String? = data?.getStringExtra("History")
            history.text = returnString
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
 
        history = findViewById(R.id.history)
        etUsername = findViewById(R.id.edit_username)
        etPassword = findViewById(R.id.edit_password)
        
        val bundle = intent.extras
        if (bundle != null) {
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.button_login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.button_login -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("User", User(etUsername.text.toString(), etPassword.text.toString()))
                resultLauncher.launch(intent)
            }
        }
    }
}