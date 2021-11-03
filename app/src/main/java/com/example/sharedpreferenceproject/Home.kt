package com.example.sharedpreferenceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferenceproject.Initialization.Companion.pref
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initUI()
    }
    fun initUI(){
        btnLogOut.setOnClickListener{
            pref.wipe()
            onBackPressed()
        }

        val username = pref.getUsername()
        txtUsername.text="Username: "+username
        val password = pref.getPassword()
        txtPassword.text="Contraseña: "+password
        val lastName = pref.getLastName()
        txtLastName.text="Apellido: "+lastName
        val firstName = pref.getFirstName()
        txtFirstName.text="Nombre: "+firstName
    }
}