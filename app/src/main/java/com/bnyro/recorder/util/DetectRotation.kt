import android.app.Activity
import android.content.pm.ActivityInfo
import android.content.res.Configuration

object OrientationChangeListener {

    fun restartActivityOnOrientationChange(activity: Activity) {
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
        activity.recreate()
    }

    fun handleConfigurationChange(activity: Activity, newConfig: Configuration) {
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE ||
            newConfig.orientation == Configuration.ORIENTATION_PORTRAIT
        ) {
            restartActivityOnOrientationChange(activity)
        }
    }
}
