package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

val TAG = "TEST"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test:Test = Test()

        val getContentActivity = registerForActivityResult(ActivityResultContracts.GetContent(), MyCallBack(test))


        val button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            getContentActivity.launch("*/*")
            Log.d(TAG,test.x.toString())
        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        Log.d(TAG, "onActivity")
//    }
}

