import { Link } from "expo-router"
import { View,Text } from "react-native"

export default function LottoScreen(){
    return(
        <View style={{marginTop:50}}>
            <Text style={{fontSize:50}}>INDEX</Text>
            <Link href="/home">
                <Text style={{fontSize:50}}>HOME</Text>
            </Link>
            <Link href="/home/aa">
                <Text style={{fontSize:50}}>AA</Text>
            </Link>
        </View>
    )
}