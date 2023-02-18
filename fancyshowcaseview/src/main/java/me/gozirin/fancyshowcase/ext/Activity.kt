package me.gozirin.fancyshowcase.ext

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import me.gozirin.fancyshowcase.FancyShowCaseView

internal fun Activity.rootView(): ViewGroup {
    val androidContent = findViewById<View>(android.R.id.content) as ViewGroup
    return androidContent.parent.parent as ViewGroup
}

internal fun Activity.attachedShowCase() =
        rootView().findViewWithTag<View>(FancyShowCaseView.CONTAINER_TAG) as FancyShowCaseView?