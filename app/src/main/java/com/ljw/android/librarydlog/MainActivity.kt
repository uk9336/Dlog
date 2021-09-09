package com.ljw.android.librarydlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ljw.android.dlog.Dlog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dlog.d("Test")
    }
}