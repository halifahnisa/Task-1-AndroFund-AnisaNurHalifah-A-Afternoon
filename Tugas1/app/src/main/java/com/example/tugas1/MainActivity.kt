package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView2)
        val usernamee = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $usernamee dan Password: $password"

        val btnImplicit: Button = findViewById(R.id.button_implicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_implicit -> {

//                val massage = "Hallo Test"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.type = "text/plain"
//                startActivity(intent)

                val intent = Intent()
                intent.putExtra("History", "Kamu berhasil login ")
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}