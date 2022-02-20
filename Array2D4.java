
package array;
import java.util.ArrayList;
import java.util.Iterator;
public class Array2D4 {
    public static void main(String[] args){
        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("size:"+number.size());
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(4,30);
        Iterator itr= number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.print("size:"+number.size()+" ");
        /*number.remove(2);
        System.out.println();
        System.out.print("after removing number:"+number);
       /* number.clear();
        System.out.println();
        System.out.print("After clearing number:"+number);
        boolean check = number.isEmpty();
        System.out.println();
        System.out.print("Array is Empty:"+check);
        System.out.println();*/
        
        boolean contain=number.contains(10);
        System.out.print("10 is in the list:"+contain);
        System.out.println();
        int pos=number.indexOf(20);
        System.out.print("the index of 20 is:"+pos);
        number.set(4, 35);
        System.out.println();
        System.out.print("After setting:"+number);
        int x=number.get(3);
        System.out.println();
        System.out.print("Index 3: "+x);
        System.out.println();
        
    }
    
}
