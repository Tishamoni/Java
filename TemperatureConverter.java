package basiccircle;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double cels,farn;
        
        System.out.print("Enter Celcius:");
        
        cels=input.nextDouble();
        farn=1.8*cels+32;
        System.out.println("Farenheight:"+farn);
    }
    
}
