
package basiccircle;
import java.util.Scanner;
 
public class loop3Demo {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        int sum=0;
        int m,n;
        System.out.print("Enter initial number:");
        m=input.nextInt();
        System.out.print("Enter final number:");
        n=input.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2==0){
            
                sum=sum+i;
                System.out.print(" "+i);
            }
        }
        
        System.out.println("the sum is:"+sum);
}
}
