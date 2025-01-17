/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {SafeAreaView, StyleSheet, Text, View} from 'react-native';
import Container from './src/Container';

function Section() {
  return (
    <View style={style.sectionContainer}>
      <Text>Section</Text>
    </View>
  );
}

function App() {
  return (
    <SafeAreaView style={{flex: 1}}>
      <View style={{backgroundColor: '#fff'}}>
        <Text style={{color: '#000', fontSize: 30,padding:20}}>신상품 목록</Text>
      </View>

      <View style={{backgroundColor: '#fff', flex: 1, flexDirection: 'row'}}>
        <Container></Container>
      </View>
    </SafeAreaView>
  );
}

export default App;
