package com.examen.hiltsample

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
     val TAG = "UserRepository"
    fun sendEmail(userName:String,password:String){
        Log.d(TAG, "sendEmail: $userName $password")
    }
}