package com.chigo.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chigo.usercenter.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding= 30;
            editText {
                hint ="name"
                textSize= 24f;
            }
            editText {
                hint ="Pwd"
                textSize= 24f;
            }
            button {
                text= "Test";
                onClick {
                    toast("${intent.getIntExtra("id",-1)}")
                }
            }
        }
    }
}
