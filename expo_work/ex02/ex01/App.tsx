import React from 'react';
import {Image, View, Text, StyleSheet} from 'react-native';

function App(): React.JSX.Element {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Hey 모두들 안녕!</Text>
      <Image
        style={styles.image}
        source={{
          uri: 'https://avatars.githubusercontent.com/u/173882568?v=4',
        }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#eee',
    justifyContent: 'center',
    alignItems: 'center',
  },
  title: {
    fontSize: 50,
  },
  image: {
    width: 200,
    height: 200,
  },
});

export default App;
