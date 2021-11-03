package com.example.sharedpreferenceproject

import android.app.Application

class Initialization: Application() {

    companion object{
        lateinit var pref:Preference
    }

    override fun onCreate() {
        super.onCreate()
        pref= Preference(applicationContext)
    }
}