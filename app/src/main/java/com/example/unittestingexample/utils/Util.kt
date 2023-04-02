package com.example.unittestingexample.utils

import android.view.View
import android.widget.TextView

fun show(view: View) {
    view.visibility = View.VISIBLE
}

fun hide(view: View) {
    view.visibility = View.GONE
}
//}

fun TextView.load(url: String) {
    this.text = url
}