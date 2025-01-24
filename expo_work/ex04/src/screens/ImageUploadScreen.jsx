import React, {useState} from 'react';
import {Button, Image, Text, TouchableOpacity, View} from "react-native";
import MyCountComponents from "../components/MyCountComponents";
import ImageUploadComponent from "../components/ImageUploadComponent";


const ImageUploadScreen = () => {
    console.log("ImageUpload 랜더링됨")
    return (
        <View style={{flex: 1, backgroundColor: 'rgb(234,234,234', justifyContent: 'center', alignItems: 'center'}}>
            <Text style={{fontSize: 30}}>ImageUploadScreen</Text>
            <View style={{flexDirection: 'row', gap: 10}}>
                <ImageUploadComponent aa={10}/>
                <ImageUploadComponent aa={20}/>
                <ImageUploadComponent aa={30}/>
            </View>
            <MyCountComponents name={1}/>
            <MyCountComponents name={2}/>
            <MyCountComponents name={3}/>
        </View>
    );
};

export default ImageUploadScreen;