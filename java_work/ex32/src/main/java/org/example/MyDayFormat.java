package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDayFormat {
   public static String myformat(LocalDateTime localDateTime){
       return DateTimeFormatter
               .ofPattern("MM/dd").format(localDateTime);
   }

    public static String myformat(String format,LocalDateTime localDateTime){
        return DateTimeFormatter
                .ofPattern(format).format(localDateTime);
    }
}
