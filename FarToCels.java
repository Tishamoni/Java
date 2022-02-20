
package basiccircle;

import java.util.Scanner;
public class FarToCels {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double farn,cels;
        System.out.print("Enter farn:");
        farn=input.nextDouble();
        cels=1.8*(farn-32);
        System.out.println("Celcius:"+cels);
    }
    
}
