package org.example

import java.util.*

class Contact(private val name: String, private var age: Byte, private var isMale: Boolean) {

    private fun getGender(): String {
        return if (isMale) "Male" else "Female"
    }

    fun print() {
        println("Hi, my name is $name")
        println("My age is $age")
        println("And my gender is ${getGender().lowercase(Locale.getDefault())}")
    }
}
