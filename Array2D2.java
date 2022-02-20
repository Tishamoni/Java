
package array;

import java.util.Scanner;
public class Array2D2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int [][] A =new int[3][3];
       int sumOfDiagonal=0;
       int sumOfupperDiagonal=0;
       int sumOflowerDiagonal=0;
       
       //matrix input
       for(int row=0;row<3;row++){
           for(int col=0;col<3;col++){
       A[row][col]=input.nextInt();
           }
       }
       //diagonal,upper,lower
       for(int row=0;row<3;row++){
           for(int col=0;col<3;col++){
               if(row==col){
            sumOfDiagonal=sumOfDiagonal+A[row][col];
               }
               if(row<col){
            sumOfupperDiagonal=sumOfupperDiagonal+A[row][col];
               }
               if(row>col){
            sumOflowerDiagonal=sumOflowerDiagonal+A[row][col];
               }
           }
       }
         System.out.print("sumOfDiagonal: "+sumOfDiagonal);
         System.out.print("sumOfDiagonal: "+sumOfupperDiagonal);
         System.out.print("sumOfDiagonal: "+sumOflowerDiagonal);
       
    }
}
