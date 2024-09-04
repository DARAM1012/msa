package org.example;

import java.io.*;

public class Ex01 {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("copyfile");
                InputStream is = new FileInputStream("myfile")
        ) {
            byte[] buf = new byte[1024];

            while (true) {
                int data = is.read();
                if (data == -1)
                    break;
                os.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
