package com.github.firdaus1453

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.lib.LibDebug.Builder.i

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        i("holla")
    }
}
