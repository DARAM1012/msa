import React, { useState } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  Image,
  Alert,
  //CheckBox
} from "react-native";
import { FontAwesome } from "@expo/vector-icons";
import axios from "axios";

export default function LoginScreen() {
  const [isRemembered, setIsRemembered] = useState(false);

  const doLogin = async () => {
    try {
      const res = await axios.post("http://m.hellomh.site/users/join", {
        email: "ddd@naver.com",
        password: "abcd1234",
      });

      if (res.status == 200) {
        Alert.alert("Sign Up", "로그인에 성공하였습니다.");
        return;
      }
      // console.log(JSON.stringify(res));
    } catch (err) {
      // console.error(JSON.stringify(err));
      Alert.alert("Sign Up", "로그인에 실패하였습니다." + err.response.data);
      return;
    }
  };

  return (
    <View style={styles.container}>
      {/* Email Input */}
      <View style={styles.inputContainer}>
        <FontAwesome
          name="envelope"
          size={20}
          color="#666"
          style={styles.icon}
        />
        <TextInput
          style={styles.input}
          placeholder="Email ID"
          placeholderTextColor="#aaa"
        />
      </View>

      {/* Password Input */}
      <View style={styles.inputContainer}>
        <FontAwesome name="lock" size={20} color="#666" style={styles.icon} />
        <TextInput
          style={styles.input}
          placeholder="Password"
          placeholderTextColor="#aaa"
          secureTextEntry
        />
      </View>

      {/* Sign In Button */}
      <TouchableOpacity style={styles.signInButton} onPress={doLogin}>
        <Text style={styles.signInButtonText}>Sign In</Text>
      </TouchableOpacity>

      {/* Remember Me and Forgot Password */}
      <View style={styles.footerContainer}>
        <View style={styles.checkboxContainer}>
          {/* <CheckBox
            value={isRemembered}
            onValueChange={setIsRemembered}
          /> */}
          <Text style={styles.footerText}>Remember me</Text>
        </View>
        <TouchableOpacity>
          <Text style={styles.footerText}>Forgot Password?</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#1c1d1e",
    alignItems: "center",
    justifyContent: "center",
    paddingHorizontal: 20,
  },
  inputContainer: {
    flexDirection: "row",
    alignItems: "center",
    backgroundColor: "rgba(255, 255, 255, 0.2)",
    borderRadius: 25,
    width: "100%",
    paddingHorizontal: 15,
    paddingVertical: 10,
    marginBottom: 15,
  },
  icon: {
    marginRight: 10,
  },
  input: {
    flex: 1,
    color: "#fff",
    fontSize: 16,
    fontFamily: "NotoSansBlack",
  },
  signInButton: {
    backgroundColor: "rgba(255, 255, 255, 0.3)",
    paddingVertical: 15,
    borderRadius: 25,
    width: "100%",
    alignItems: "center",
    marginTop: 20,
  },
  signInButtonText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "bold",
    fontFamily: "NotoSansBlack",
  },
  footerContainer: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    width: "100%",
    marginTop: 20,
  },
  checkboxContainer: {
    flexDirection: "row",
    alignItems: "center",
  },
  footerText: {
    color: "#aaa",
    fontSize: 14,
    fontFamily: "NotoSansBlack",
  },
});
