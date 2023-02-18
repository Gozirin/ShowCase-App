

package me.gozirin.fancyshowcase.listener

/**
 * Listener for FancyShowCaseQueue completion
 */

interface OnCompleteListener {

    /**
     * Triggers after the last item in a FancyShowCaseQueue is shown
     */
    fun onComplete()
}
