
package stringdemo1;


public class StringDemo4 {
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("Tisha");
        str.append("moni");
        System.out.println(" "+str);
        str.delete(2,5);
        System.out.print(" "+str);
    }
}
