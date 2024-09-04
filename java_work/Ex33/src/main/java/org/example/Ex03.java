package org.example;

import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myfile");



        while (true){
        int ch = fr.read();
        System.out.println(ch);
        System.out.println((char)ch);

        if(ch==-1)
            break;
        }

        // 한문사 읽음
//        ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
        
    }
}
