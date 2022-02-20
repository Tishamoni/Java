
package number_conversion;
import java.util.Scanner;
public class NumberConversionDemo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter decimal number:");
        decimal=input.nextInt();
       String binary= Integer.toBinaryString(decimal);
        System.out.println("Binary number="+binary);
        String octal= Integer.toOctalString(decimal);
        System.out.println("Octal number="+octal);
        String hex= Integer.toHexString(decimal);
        System.out.println("Hexa Decimal number="+hex);
        

        
    }
}
