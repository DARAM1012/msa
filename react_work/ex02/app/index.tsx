import AA from "@/mcomponents/aa";
import { useRouter } from "expo-router";
import { useEffect, useState } from "react";
import { StyleSheet, Text, TouchableOpacity, View } from "react-native";

const Index = () => {

  const router = useRouter();

  const onPress = () => {
    router.push("/(tabs)");
  };

const onMyMain = ()=>{
  router.push("/mymain");
}

  const onConsole = () => {
    console.log("");
  };
  // watch([],()=>{});
  // 최초에 한번만 실행
  useEffect(()=>{
    console.log("index component useEffect")
  },[]);
  return (
    // <View style={{ marginTop: 50 }}>
    <View style={ss.container}>
      <Text style={ss.text}>Index</Text>
      <Text style={ss.text}>RouterLink - router.push Link - router.push</Text>
      <TouchableOpacity onPress={onPress}>
        <Text>Click Me</Text>
        <Text style={ss.text}>여기 누르면 변경된다</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={onConsole}>
        <Text>Click Me</Text>
        <Text style={ss.text}>여기 누르면 출력된다</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={onMyMain}>
        <Text>Click Me</Text>
        <Text style={ss.text}>여기 누르면 MyMain으로 간다</Text>
      </TouchableOpacity>
      <AA/>
    </View>
  );
};

export default Index;

const ss = StyleSheet.create({
  container: {
    marginTop: 50,
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  text: {
    fontFamily: "JUA",
    fontSize: 20,
  },
});
