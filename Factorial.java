
package basiccircle;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,fact=1;
        System.out.print("Enter number:");
        n=input.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+"*");
            fact=fact*i;
        }
        System.out.println();
        System.out.println("Factorial of"+n+"="+fact);
    }
}
