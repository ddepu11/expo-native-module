import {
  NativeModulesProxy,
  EventEmitter,
  Subscription,
} from "expo-modules-core";

// Import the native module. On web, it will be resolved to ExpoNativeModule.web.ts
// and on native platforms to ExpoNativeModule.ts
import ExpoNativeModule from "./ExpoNativeModule";

export function getTheme(): string {
  return ExpoNativeModule.getTheme();
}
