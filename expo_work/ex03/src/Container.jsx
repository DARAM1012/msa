import React, {Component, useState} from 'react';
import {
  View,
  Text,
  StyleSheet,
  Image,
  TouchableOpacity,
} from 'react-native';

const imgArr = [
  {
    idx: 1,
    name: '스타1',
    uri: require('../assets/images/princess2.png'),
  },
  {
    idx: 2,
    name: '스타2',
    uri: require('../assets/images/princess2.png'),
  },
  {
    idx: 3,
    name: '스타3',
    uri: require('../assets/images/princess2.png'),
  },
  {
    idx: 4,
    name: '스타4',
    uri: require('../assets/images/princess2.png'),
  },
  {
    idx: 5,
    name: '스타5',
    uri: require('../assets/images/princess2.png'),
  },
  {
    idx: 6,
    name: '스타6',
    uri: require('../assets/images/princess2.png'),
  },
];

const Container = () => {
  const [num, setNum] = useState();
  const imgPress = (pressNum) => {
    setNum(pressNum);
  };
  return (
    <View style={styles.container}>
      <Text
        style={{
          color: '#fbfbfb',
          fontSize: 30,
          width: '100%',
          paddingHorizontal: 20,
        }}>
        Container
      </Text>

      {imgArr.map(image => {
        return (
          <TouchableOpacity
            style={{width: '30%', height: 150}}
            onPress={() => imgPress(image.idx)}>
            <Image
              source={image.uri}
              style={{width: '100%', height: '100%', position:'relative'}}></Image>
              {
                num === image.idx && //클릭한 num이랑 이미지의 idx가 같으면 나오게하기
              <View style={{position:'absolute',bottom:0,left:5, backgroundColor:'rgba(0,0,0,0.4)'}}>
                <Text style={styles.textStyle}>{image.name}</Text>
              </View>
              }
          </TouchableOpacity>
        );
      })}
      <Text style={styles.textStyle}>{num}</Text>
    </View>
  );
};

// define your styles
const styles = StyleSheet.create({
  container: {
    gap: 10,
    flex: 1,
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#7c7e78',
  },
  textStyle: {
    color: '#fbfbfb',
    fontSize: 30,
    width: '100%',
    paddingHorizontal: 20,
  },
});

//make this component available to the app
export default Container;
