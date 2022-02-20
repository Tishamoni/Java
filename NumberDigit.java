package basiccircle;
import java.util.Scanner;
public class NumberDigit {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter Digit:");
        digit=input.nextInt();
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
                case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("two");
                break;
                case 3:
                System.out.println("three");
                break;
                case 4:
                System.out.println("four");
                break;
                case 5:
                System.out.println("five");
                break;
                case 6:
                System.out.println("Six");
                break;
                case 7:
                System.out.println("seven");
                break;
                case 8:
                System.out.println("eight");
                break;
                case 9:
                System.out.println("nine");
                break;

        }
        
    }
    
}
