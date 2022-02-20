
package datedemo;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random rand=new Random();
        int randNumber=(int)(Math.random()*10);
        System.out.print("Random Number:"+randNumber);
    }
}
