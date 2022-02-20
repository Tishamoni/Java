
package datedemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentTime {
    public static void main(String[] args){
        LocalTime time=LocalTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("hh.mm.ss");
       String formatterTime= time.format(formatter);
       System.out.println(formatterTime);
    }
}
