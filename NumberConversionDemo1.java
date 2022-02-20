package stringdemo1;

public class NumberConversionDemo1 {
    public static void main(String[] args){
        String binary="1010";
        Integer dec=Integer.parseInt(binary,2);
        System.out.println(" "+dec);
        String octal="675";
        Integer decimal =Integer.parseInt(octal,8);
        System.out.println(" "+decimal);
        String hex="A";
        Integer deci=Integer.parseInt(hex,16);
         System.out.println(" "+deci);
    }
}
