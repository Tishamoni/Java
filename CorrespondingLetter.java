
package basiccircle;
import java.util.Scanner;
public class CorrespondingLetter {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        char ch;
        int i;
        for(i=65;i<=122;i++){
            ch=(char)i;
            System.out.println("code no :"+i+"Correspond to:"+ch);
        }
    }
    
}
