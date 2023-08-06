package com.example.testunit5

import java.text.NumberFormat
import java.text.ParsePosition

class Math {
    fun add(a: String, b: String): String {
        var result = if (a.isEmpty() || b.isEmpty()) {
            "You didn't enter anything!"
        } else if (a.contains("..") || b.contains("..")) {
            "You entered two points!"
        } else if (a.contains(".") || b.contains(".")) {
            val doubleResult = (a.toDouble() + b.toDouble())
            if (doubleResult % 1 > 0.0) {
                (a.toDouble() + b.toDouble()).toString()
            } else {
                (a.toDouble() + b.toDouble()).toInt().toString()
            }
        } else if (a.contains(" ") || b.contains(" ")) {
            (a.replace(" ", "").toInt() + b.replace(" ", "").toInt()).toString()
        } else if (!a.isNumeric() || !b.isNumeric()) {
            "You can't enter letters!"
        } else {
            (a.toInt() + b.toInt()).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = if (b == "0") {
            "You can't divide by 0!"
        } else if (a.isEmpty() || b.isEmpty()) {
            "You didn't enter anything!"
        } else {
            (a.toInt() / b.toInt()).toString()
        }
        return result
    }

    private fun String.isNumeric(): Boolean {
        val pos = ParsePosition(0)
        NumberFormat.getInstance().parse(this, pos)
        return this.length == pos.index
    }
}