
package datedemo;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args){
        Date date = new Date();
        DateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy") ;
        String currentdate=dateformat.format(date);
        System.out.println(" current date:"+currentdate);
    }
            
}
