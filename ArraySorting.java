
package array;

import java.util.Arrays;


public class ArraySorting {
    public static void main(String[] args){
        int[] number={3,-5,4,10,15};
        Arrays.sort(number);
        for(int i=0;i<5;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

        for(int i=4;i>=0;i--){
            
            System.out.print(number[i]+" ");
        }
        
    }
    
}
