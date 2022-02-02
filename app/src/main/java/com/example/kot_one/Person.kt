package com.example.kot_one

data class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "Name : $name Age: $age"
    }
}
