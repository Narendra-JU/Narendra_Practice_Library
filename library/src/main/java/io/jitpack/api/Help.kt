package io.jitpack.api

import android.content.Context

import android.widget.Toast

object Help{
    fun getToast(ctx:Context){
        Toast.makeText(ctx, "Narendra's Library", Toast.LENGTH_SHORT).show()
    }
}