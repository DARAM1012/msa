import React, {useState} from 'react';
import {Image, TouchableOpacity} from "react-native";
import {launchImageLibrary} from "react-native-image-picker";

const ImageUploadComponent = ({aa}) => {
    const [imageUri, setImageUri] = useState();
    const pickImage = async () => {
        const res = await launchImageLibrary({mediaType: 'photo', quality: 1})
        if (res.assets && res.assets.length > 0) {
            console.log(res.assets[0].uri);
            setImageUri(res.assets[0].uri);
        }
    };
    return (
        <TouchableOpacity onPress={pickImage}>
            {
                imageUri !== undefined ?
                    < Image source={{uri: imageUri}} style={{width: 100, height: 100}}/> :
                    <Image
                        source={require('../../assets/images/dog.jpg')}
                        style={{width: 100, height: 100}}
                    />
            }
        </TouchableOpacity>
    );
};

export default ImageUploadComponent;