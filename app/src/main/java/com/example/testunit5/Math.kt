package com.example.testunit5

class Math {
    fun add(a : String, b : String) : String {
        var result = ""
        result = (a.toInt() + b.toInt()).toString()
        return result
    }
}