package com.example.sharedpreferenceproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferenceproject.Initialization.Companion.pref
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        checkData()
    }
    fun initUI(){
        btnRegister.setOnClickListener{ saveData()}
    }
    fun checkData(){
            if(pref.getUsername().isNotEmpty()&&pref.getPassword().isNotEmpty()){
                gotoView()
            }
    }
    fun saveData() {

        if (username.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            pref.saveUsername(username.text.toString())
            pref.saveFirstName(editPersonName.text.toString())
            pref.saveLastName(editPersonLastName.text.toString())
            pref.savePassword(password.text.toString())
            gotoView()
        } else {

        }
    }
    fun gotoView(){
        startActivity(Intent(this,Home::class.java))
    }
}