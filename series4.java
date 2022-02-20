
package basiccircle;
import java.util.Scanner;

public class series4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int num,result=1;
        System.out.print("Enter the last number:");
        num=input.nextInt();
        for(int i=1; i<=num ; i++){
            System.out.print(i+"X"+ i+ " ");
            result=result*i*i;
        }
        System.out.println();
        System.out.println("Result:"+result);
        
    }

    
    
}
