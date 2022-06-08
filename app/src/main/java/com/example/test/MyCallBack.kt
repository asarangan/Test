package com.example.test

import android.net.Uri
import androidx.activity.result.ActivityResultCallback

class MyCallBack (var test: Test) : ActivityResultCallback<Uri> {

    override fun onActivityResult(result: Uri?) {
        test.x = 1
    }



}