package com.abumadi.sharedviewmodel

import android.content.ClipData
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    val selected = MutableLiveData<String>()

    fun select(item: String) {
        selected.value = item
    }
}