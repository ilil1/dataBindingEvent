package com.project.databindingevent

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast

class MyHandlers(val context : Context) {
    fun onClickFriend(view: View) {
        Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Click")
    }
}
