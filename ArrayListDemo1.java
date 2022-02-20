
package array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<Integer> number= new ArrayList <>();
        number.add(10);
        number.add(20);
        number.add(-30);
        number.add(40);
        
        Collections.sort(number);
        System.out.print("The Ascending number is: "+number);
        System.out.println();
        Collections.sort(number,Collections.reverseOrder());
        System.out.print(" The descending number is: "+number);
    }
}
