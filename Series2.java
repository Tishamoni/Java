
package basiccircle;

import java.util.Scanner;
public class Series2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter the last number:");
        num=input.nextInt();
        for(int i=1; i<=num ; i++){
            System.out.print(i+"X"+ i+ " ");
            sum=sum+i*i;
        }
        System.out.println();
        System.out.println("Sum:"+sum);
        
    }
    
}
