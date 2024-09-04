package org.example;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("myfile",true));

        bw.write("글자를 바꿀거야");
        bw.newLine();
        bw.write("바꼈나");
        bw.newLine();
        bw.write("그래서 이게 뭔데");
        bw.close();

        BufferedReader fr = new BufferedReader(new FileReader("myfile"));


        while (true) {
            String str = fr.readLine();
            System.out.println(str);

            if (str == null)
                break;
        }

    }
}
