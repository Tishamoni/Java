
package array;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    double[] number = new double[5];
    double sum=0;
    System. out .print("Enter 5 numbers:");
    for(int i=0;i<number.length;i++){
    number[i] =input.nextDouble();
    }
    for(int i=0;i<number.length;i++){
        sum=sum+number[i];
    }
       System.out.println("the sum is:"+sum); 
      double average=sum/number.length;
      System.out.println("The Average is:"+average);
    }
}
