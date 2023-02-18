
package me.gozirin.fancyshowcase

import me.gozirin.fancyshowcase.listener.OnCompleteListener
import me.gozirin.fancyshowcase.listener.OnQueueListener
import java.util.LinkedList
import java.util.Queue

/**
 * Handles queues of [FancyShowCaseView] so that they are shown one after another
 * takes care to skip views that should not be shown because of their one shot id
 */
class FancyShowCaseQueue : OnQueueListener {

    private val queue: Queue<FancyShowCaseView> = LinkedList()
    var current: FancyShowCaseView? = null
    var completeListener: OnCompleteListener? = null


    /**
     * Adds a FancyShowCaseView to the queue
     *
     * @param showCaseView the view that should be added to the queue
     * @return Builder
     */
    fun add(showCaseView: FancyShowCaseView): FancyShowCaseQueue {
        queue.add(showCaseView)
        return this
    }

    /**
     * Starts displaying all views in order of their insertion in the queue, one after another
     */
    fun show() {
        if (queue.isNotEmpty()) {
            current = queue.poll().apply {
                queueListener = this@FancyShowCaseQueue
                show()
            }
        } else {
            completeListener?.onComplete()
        }
    }

    /**
     * Cancels the queue
     * @param hideCurrent hides current FancyShowCaseView
     */
    fun cancel(hideCurrent: Boolean = true) {
        if (hideCurrent) current?.hide()

        if (queue.isNotEmpty()) queue.clear()
    }

    override fun onNext() {
        show()
    }
}
