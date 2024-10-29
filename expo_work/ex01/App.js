import { StatusBar } from "expo-status-bar";
import {
  StyleSheet,
  Text,
  View,
  Pressable,
  TouchableOpacity,
  Alert,
} from "react-native";
import { Button } from "react-native-web";

export default function App() {
  const doPerss1 = () => {
    Alert.alert("doPress1");
    console.log("test11");
  };

  const doPerss2 = () => {
    Alert.alert("doPress2");
    console.log("test22");
  };

  return (
    <View style={styles.container}>
      <Text style={styles.text}>
        Open up App.js to start working on your app!
      </Text>
      <Text style={styles.text}>This is a simple React Native app.</Text>
      <Text style={styles.text}>This is a simple React Native app.</Text>
      <TouchableOpacity style={styles.Button} onPress={doPerss1}>
        <Text>누르는버튼</Text>
      </TouchableOpacity>
      <Pressable style={styles.Button} onPress={doPerss2}>
        <Text>누르는버튼</Text>
      </Pressable>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#aaa",
    alignItems: "center",
    justifyContent: "center",
  },
  text: {
    fontSize: 24,
    color: "white",
  },
  Button: {
    backgroundColor: "blue",
    padding: 10,
    borderRadius: 5,
    color: "white",
    marginTop: 10,
  },
});
