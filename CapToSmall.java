package basiccircle;
import java.util.Scanner;
public class CapToSmall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char upper,lower;
        int ascii;
        System.out.print("Enter Capital letter:");
        upper=input.next().charAt(0);
        ascii=upper;
        ascii=ascii+32;
        lower=(char)ascii;
        System.out.println("The small letter is:"+lower);
    }
    
}
