
package basiccircle;

import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.print("Enter any number:");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0)
                {
                   r=temp%10 ;
                   sum=sum+r*r*r;
                   temp=temp/10;
                }
        
    
    if (sum==num){
    System.out.println("armsrtong number");
}
    else{
     System.out.println("not armstrong number");
}
}
}