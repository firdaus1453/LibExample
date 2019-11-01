package com.github.lib

import android.util.Log

/**
 * Created by Muhammad Firdaus on 01/11/2019.
 */
class LibDebug {
    companion object Builder {
        private const val TAG = "LIB_EXAMPLE_ANDROID"

        fun i(message:String){
            Log.i(TAG, message)
        }
    }
}