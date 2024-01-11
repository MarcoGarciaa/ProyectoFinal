package com.example.proyectofinalgrado

import android.media.Image
import android.widget.ImageView
import java.io.Serializable

class User () : Serializable {
    private var username: String = ""
    private var password: String = ""
    private var email: String = ""
    private var phoneNumber: String = ""
    private var name: String = ""
    private var bibliography: String = ""
    private var image: ImageView? = null

    fun getUsername(): String {
        return username
    }
    fun setUsername(newUsername: String) {
        username = newUsername
    }
    fun getPassword(): String {
        return password
    }
    fun setPassword(newPassword: String) {
        password = newPassword
    }
    fun getEmail(): String {
        return email
    }
    fun setEmail(newEmail: String) {
        email = newEmail
    }
    fun getPhoneNumber(): String {
        return phoneNumber
    }
    fun setPhoneNumber(newPhoneNumber: String) {
        phoneNumber = newPhoneNumber
    }
    fun getName(): String {
        return name
    }
    fun setName(newName: String) {
        name = newName
    }
    fun getBibliography(): String {
        return bibliography
    }
    fun setBibliography(newBibliography: String) {
        bibliography = newBibliography
    }
    fun getImage(): ImageView? {
        return image
    }
    fun setImage(newImage: ImageView) {
        image = newImage
    }

}