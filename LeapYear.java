
package basiccircle;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Y; 
        System.out.print("Input the year:");
        Y=input.nextInt();
        if((Y%4==0) && (Y%100!=0) ||(Y%400==0)){
            System.out.println(Y+"is leap Year");
        }
        else{
            System.out.println(Y+"is not leap year");
        }
    }
}
