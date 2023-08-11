package expo.modules.nativemodule

import android.content.Context
import expo.modules.core.interfaces.Package

class MyLibPackage:Package {
    override fun createReactActivityLifecycleListeners(activityContext: Context?): List<MyLibReactActivityLifecycleListener> {
        return listOf(MyLibReactActivityLifecycleListener())

    }
}