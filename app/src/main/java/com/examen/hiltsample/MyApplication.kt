package com.examen.hiltsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication:Application() {
     // field injection example
     @Inject
     lateinit var userRepository:UserRepository
     override fun onCreate() {
        super.onCreate()
        userRepository.sendEmail("sainath@gmai.com","pass1234")
    }
}