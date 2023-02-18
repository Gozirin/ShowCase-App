
package me.gozirin.showcase

import androidx.appcompat.app.AppCompatActivity

import me.gozirin.fancyshowcase.FancyShowCaseView

/**
 * Created by yeldos on 3/29/17.
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onBackPressed() {
        if (FancyShowCaseView.isVisible(this)) {
            FancyShowCaseView.hideCurrent(this)
        } else {
            super.onBackPressed()
        }
    }
}
