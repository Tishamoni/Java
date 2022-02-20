
package basiccircle;
import java.util.Scanner;

public class CircleClass {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double r,area;
        System.out.print("Enter radius:");
        r=input.nextDouble();
        area=3.14*r*r;
        System.out.println("Area:"+area);
    }
    
}
