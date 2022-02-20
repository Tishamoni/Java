
package basiccircle;
import java.util.Scanner;

public class largesmall {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        System.out.print("Enter 2 interger numbers:");
        num1=input.nextInt();
        num2=input.nextInt();
        large=(num1>num2)?num1:num2;
        System.out.println("large number:"+large);
        
    }
}
