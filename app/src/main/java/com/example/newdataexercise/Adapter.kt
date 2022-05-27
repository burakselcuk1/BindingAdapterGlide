package com.example.newdataexercise

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bozo")
fun ImageView.loadImage( url: String) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}