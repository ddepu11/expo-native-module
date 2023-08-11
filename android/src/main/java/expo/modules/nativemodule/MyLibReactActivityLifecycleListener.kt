package expo.modules.nativemodule


import android.app.Activity
import android.os.Bundle
import android.util.Log
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class MyLibReactActivityLifecycleListener : ReactActivityLifecycleListener {
    override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {

    }

    private val isPipSupported by lazy {



    }

    override fun onPause(activity: Activity?) {
        super.onPause(activity)


        Log.d("ON_PAUSE","Paused")

    }

}