package com.examen.hiltsample

import android.util.Log
import javax.inject.Inject


class FragmentRepository @Inject constructor(){
    val TAG = "FragmentRepository"
    fun sendMessage(sender:String,message:String){
        Log.d(TAG, "sendMessage: $sender $message")
    }
}