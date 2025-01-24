import React from 'react';
import {StyleSheet, Text, TouchableOpacity, View} from 'react-native';
import CheckBox from '../../assets/images/check.svg';
import CheckedBox from '../../assets/images/checked.svg';
import DeletedBox from '../../assets/images/delete.svg';
import InputFormComponent from "../components/InputformComponent";

const todos = [
    {
        id: '1',
        text: '할일1',
        state: 'todo',
    },
    {
        id: '2',
        text: '할일2',
        state: 'done',
    },
    {
        id: '3',
        text: '할일3',
        state: 'done',
    },
    {
        id: '4',
        text: '할일4',
        state: 'todo',
    },
];

const TodoMainScreen = () => {
    return (
        <>
            <View style={styles.mainContainer}>
                <Text style={styles.pageTitle}>ToDo App</Text>
                <View style={styles.listView}>
                    <Text style={styles.ListTitle}>할일</Text>
                    <View>
                        {todos.map(todo => {
                            console.log(todo);
                            if (todo.state === 'todo') {
                                return(
                                    <>
                                        <View style={{flexDirection: 'row'}}>
                                            <CheckBox width={30} height={30}></CheckBox>
                                            <CheckedBox width={30} height={30}></CheckedBox>
                                            <Text style={{flex:1}}>{todo.text}</Text>
                                            <TouchableOpacity onPress={()=>{
                                                console.log('press');
                                            }}>
                                                <DeletedBox width={30} height={30}></DeletedBox>
                                            </TouchableOpacity>

                                            {/*<Svg height="100" width="100">*/}
                                            {/*    <Circle cx="50" cy="50" r="40" stroke="blue" strokeWidth="2.5" fill="green" />*/}
                                            {/*    <Rect x="10" y="10" width="30" height="30" stroke="red" strokeWidth="2" fill="yellow" />*/}
                                            {/*</Svg>*/}
                                        </View>
                                    </>
                                );
                            }
                        })}
                    </View>
                </View>
                <View style={styles.separator}></View>
                <View style={styles.listView}>
                    <Text style={styles.ListTitle}>완료된일</Text>
                </View>
            </View>
            <InputFormComponent />
        </>
    );
};

export default TodoMainScreen;

const styles = StyleSheet.create({
    mainContainer: {
        flex: 1,
        padding: 20,
    },
    pageTitle: {
        fontSize: 30,
        fontWeight: 'bold',
    },
    listView: {
        padding: 20,
    },
    ListTitle: {
        fontSize: 20,
        fontWeight: 'bold',
    },
    separator: {
        height: 1,
        backgroundColor: 'gray',
    },
});
