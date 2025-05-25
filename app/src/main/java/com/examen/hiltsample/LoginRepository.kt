package com.examen.hiltsample

import android.util.Log
import javax.inject.Inject


class LoginRepository @Inject constructor(){
    val TAG = "loginRepository"
    fun registerUser(empID:Int,userName:String,email:String,password:String, phoneNo:Long,address:String){
        Log.d(TAG, "registerUser:LoginRepository is called $empID $userName $email $password $phoneNo $address ")
    }
}