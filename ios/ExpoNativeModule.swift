import ExpoModulesCore

public class ExpoNativeModule: Module {
  public func definition() -> ModuleDefinition {
    
    Name("ExpoNativeModule")

    Function("getTheme") { () -> String in
      "system"
    }
  }
}
