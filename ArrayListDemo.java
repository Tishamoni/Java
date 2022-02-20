package array;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.print("Number 1:"+number1);
        System.out.println();
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.print("Number 2:"+number2);
        System.out.println();
        
        number3.addAll(number1);
        System.out.print("Number 3:"+number3);
        System.out.println();
        
        boolean result=number1.equals(number2);
        System.out.print("number1==number2:"+result);
        System.out.println();
        result=number1.equals(number3);
        System.out.print("number1==number3:"+result);
        
        
    }
}
