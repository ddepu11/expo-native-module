package expo.modules.nativemodule

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoNativeModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoNativeModule")
    
    Function("getTheme") {
      return@Function "system"
    }
  }
}
