package com.example.sharedpreferenceproject

import android.content.Context

class Preference(val context: Context) {
    val SHARED_NAME = "Data"
    val SHARED_FIRST_NAME = "first_name"
    val SHARED_USERNAME = "username"
    val SHARED_PASSWORD = "password"
    val SHARED_LAST_NAME = "last_name"
    val storage = context.getSharedPreferences(SHARED_NAME,0)
    fun saveFirstName(first_name:String){
        storage.edit().putString(SHARED_FIRST_NAME,first_name).apply()
    }
    fun saveLastName(last_name:String){
        storage.edit().putString(SHARED_LAST_NAME,last_name).apply()
    }
    fun saveUsername(username:String){
        storage.edit().putString(SHARED_USERNAME,username).apply()
    }
    fun savePassword(password:String){
        storage.edit().putString(SHARED_PASSWORD,password).apply()
    }
    fun getUsername():String{
        return storage.getString(SHARED_USERNAME,"")!!
    }
    fun getPassword(): String{
        return storage.getString(SHARED_PASSWORD,"")!!
    }
    fun getFirstName(): String{
        return storage.getString(SHARED_FIRST_NAME,"")!!
    }
    fun getLastName(): String{
        return storage.getString(SHARED_LAST_NAME,"")!!
    }
    fun wipe(){
        storage.edit().clear()
    }
}