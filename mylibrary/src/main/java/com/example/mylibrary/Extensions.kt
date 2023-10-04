package com.example.mylibrary

import android.util.Log

fun Any.logd(msg: String, tag: String = "RequestX") {
    Log.d(tag, msg)
}

fun Any.logd(msg: Number, tag: String = "RequestX") {
    Log.d(tag, msg.toString())
}