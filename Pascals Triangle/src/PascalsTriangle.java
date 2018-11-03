/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Ajith Menon
 */
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,N,r,k=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows");
        N=sc.nextInt();
        for(i=0;i<N;i++){
         for(j=0;j<N-i;j++)
         {System.out.print(" ");}
         k=1;
         for(r=0;r<=i;r++){
          System.out.print(k+" ");
          k=k*(i-r)/(r+1);
         }
         System.out.println();}
    }
    
}
