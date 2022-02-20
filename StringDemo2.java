
package stringdemo1;


public class StringDemo2 {
    public static void main(String[] args){
        String firstname="tisha";
        String lastname="moni";
        
        String fullname= firstname.concat(lastname);
        System.out.println(" "+fullname);
         
        String Uppername= fullname. toUpperCase();
        System.out.println(" "+Uppername);
         
        String lowername= fullname. toLowerCase();
        System.out.println(" "+lowername);
         boolean b=firstname.startsWith("tis");
         System.out.println(" "+b);
         boolean last=lastname.endsWith("ni");
         System.out.println(" "+last);
         
         
         
        
    }
}
