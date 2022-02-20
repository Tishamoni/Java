
package array;

import java.util.Scanner;
public class Array2D1 {
    public static void main(String[] args){
        System.out.println("Enter 2 dimentional Array");
        Scanner input=new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //Amatrix
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("A[%d][%d]= ",row,col);
                A[row][col]=input.nextInt();
            }}
        //B matrix
        for( int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("B[%d][%d]= ",row,col);
                B[row][col]=input.nextInt();
            }}
        System.out.print("\n\n ");
        //print A matrix
            System.out.print("A=");
            for( int row=0; row<2; row++){
            for(int col=0;col<3;col++){
                System.out.print(" \t"+A[row][col]);
            }
        }
            System.out.print("\n\n ");
            //print B matrix
            System.out.println("B=");
            for( int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("\t "+B[row][col]);
            }
        }
            System.out.print("\n\n ");
          //Adding A and B
          System.out.println("A+B=");
          for( int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                
                System.out.print(" "+A[row][col]+B[row][col]);
            }
        }
    }
    
}
