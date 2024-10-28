import {
  StyleSheet,
  View,
  TouchableOpacity,
} from "react-native";

import { HelloWave } from "@/components/HelloWave";
import { ThemedText } from "@/components/ThemedText";
import { useState } from "react";
import ParallaxScrollView from "@/components/ParallaxScrollView";
import Ionicons from "@expo/vector-icons/Ionicons";

import { ViewStyle } from 'react-native';

const viewStyle: ViewStyle = {
  backgroundColor: '#999',
  padding: 10,
};

export default function AboutScreen() {
  const url = "https://backend.hellomh.site";

  const [data, setData] = useState("about");
  const onPress = () => {
    setData(data + "!");
  };

  return (
    <View>
      <HelloWave />
      <ThemedText type="title">ABOUT</ThemedText>
      <ParallaxScrollView
        headerBackgroundColor={{ light: "#D0D0D0", dark: "#353636" }}
        headerImage={
          <Ionicons size={310} name="code-slash" style={styles.headerImage} />
        }
      >
        <ThemedText type="title">Welcome!</ThemedText>
        <ThemedText>
          This app includes example code to help you get started.
        </ThemedText>
        <ThemedText type="subtitle">{data}</ThemedText>
        <TouchableOpacity onPress={onPress}>
          <View style={viewStyle}>
            <ThemedText type="defaultSemiBoldWhite">Press me // Press me! when I'm clicked.</ThemedText>
          </View>
        </TouchableOpacity>
      </ParallaxScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  titleContainer: {
    flexDirection: "row",
    alignItems: "center",
    gap: 8,
  },
  stepContainer: {
    gap: 8,
    marginBottom: 8,
  },
  reactLogo: {
    height: 178,
    width: 290,
    bottom: 0,
    left: 0,
    position: "absolute",
  },
  headerImage: {
    color: "#808080",
    bottom: -90,
    left: -35,
    position: "absolute",
  },
});
