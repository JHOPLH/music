package com.dede.sonimei.util.extends

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.dede.sonimei.net.GlideApp

/**
 * Created by hsh on 2018/5/15.
 */
fun ImageView.load(url: String?) {
    GlideApp.with(this)
            .load(url)
            .transition(withCrossFade())
            .into(this)
}

fun Context.color(@ColorRes res: Int) = ContextCompat.getColor(this, res)
fun Fragment.color(@ColorRes res: Int) = ContextCompat.getColor(this.context!!, res)

fun View?.gone() {
    if (this == null) return
    this.visibility = View.GONE
}

fun View?.show() {
    if (this == null) return
    this.visibility = View.VISIBLE
}

fun View?.hide() {
    if (this == null) return
    this.visibility = View.INVISIBLE
}