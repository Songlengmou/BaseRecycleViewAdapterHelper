package com.syp.library.animation

import android.animation.Animator
import android.view.View

/**
 * @author Song
 */
interface BaseAnimation {
    fun animators(view: View): Array<Animator>
}