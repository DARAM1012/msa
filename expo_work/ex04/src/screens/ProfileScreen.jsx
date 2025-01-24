import {Button, StyleSheet, Text, View} from "react-native";
import React from "react";

function ProfileScreen({navigation}) {
    return (
        <View style={styles.container}>
            <Text style={styles.text}>Profile Screen</Text>
            <Button title="Go to Home" onPress={() => navigation.navigate('Home')} />
        </View>
    );
};

export  default ProfileScreen;

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
    },
    text: {
        fontSize: 20,
        fontWeight: 'bold',
    },
});