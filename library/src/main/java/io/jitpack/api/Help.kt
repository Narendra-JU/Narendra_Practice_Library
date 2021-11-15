package io.jitpack.api

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

object Help{
    fun getToast(ctx:Context){
        Toast.makeText(ctx, "Narendra's Library", Toast.LENGTH_SHORT).show()
    }
}