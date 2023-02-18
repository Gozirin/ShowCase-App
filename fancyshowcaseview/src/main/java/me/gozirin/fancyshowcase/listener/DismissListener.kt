

package me.gozirin.fancyshowcase.listener

/**
 * Listener for dismissing of one FancyShowCaseView
 */
interface DismissListener {
    /**
     * is called when a [FancyShowCaseView] is dismissed
     *
     * @param id the show once id of the dismissed view
     */
    fun onDismiss(id: String?)

    /**
     * is called when a [FancyShowCaseView] is skipped because of it's show once id
     *
     * @param id the show once id of the dismissed view
     */
    fun onSkipped(id: String?)
}
