import React, {useState} from 'react';
import {Button, Text, View} from "react-native";

const MyCountComponents = ({name}) => {
    const [count, setCount] = useState(0);
    console.log("MyCountComponent 랜더링됨"+name);
    return (
        <View style={{gap:10}}>
            <Text style={{fontSize:30}}>count = {count}</Text>
            <Button title="증가" onPress={() => setCount(count + 1)}/>
            <Button title="감소" onPress={() => setCount(count - 1)}/>
        </View>
    );
};

export default MyCountComponents;