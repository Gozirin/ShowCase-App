

package me.gozirin.fancyshowcase.listener

/**
 * Listener for enter/exit animations
 */

interface AnimationListener {

    /**
     * Triggers after default (not custom) enter animation finishes
     */
    fun onEnterAnimationEnd()

    /**
     * Triggers after default (not custom) exit animation finishes
     */
    fun onExitAnimationEnd()
}
