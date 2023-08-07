import { StyleSheet, Text, View } from "react-native";

import * as ExpoNativeModule from "expo-native-module";

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Theme: {ExpoNativeModule.getTheme()}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, alignItems: "center", justifyContent: "center" },
});
