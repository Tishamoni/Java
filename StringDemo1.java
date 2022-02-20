
package stringdemo1;

public class StringDemo1 {
    public static void main(String[] args){
       String s1="anisul islam";
       String s2="Anisul Islam";
       
       System.out.println(" "+s1);
        System.out.println(" "+s2);
        int len=s1.length();
        System.out.println(" "+len);
        
        boolean con=s1.contains ("islam");
        System.out.println(" "+con);
        
        boolean b=s1.isEmpty();
        System.out.println(" "+b);

       
    }
    
    
}
