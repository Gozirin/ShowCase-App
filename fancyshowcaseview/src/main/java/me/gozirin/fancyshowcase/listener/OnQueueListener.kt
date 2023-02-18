

package me.gozirin.fancyshowcase.listener

/**
 * Listener for FancyShowCaseQueue next item
 */
interface OnQueueListener {

    /**
     * Triggers before showing the next item in a FancyShowCaseQueue
     */
    fun onNext()
}