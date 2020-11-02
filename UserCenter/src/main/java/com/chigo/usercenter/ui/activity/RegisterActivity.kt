package com.chigo.usercenter.ui.activity

import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.chigo.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mRegisterBtn.setOnClickListener {
            Toast.makeText(this,"register",Toast.LENGTH_SHORT).show();
        }
    }
}
