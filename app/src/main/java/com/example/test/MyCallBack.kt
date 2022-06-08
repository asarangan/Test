package com.example.test

import android.net.Uri
import androidx.activity.result.ActivityResultCallback

class MyCallBack : ActivityResultCallback<Uri> {
    var test:Boolean = true
    override fun onActivityResult(result: Uri?) {
        val q = 1
    }

}