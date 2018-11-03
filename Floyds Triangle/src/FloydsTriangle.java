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
public class FloydsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
    System.out.println("Enter the no. of rows");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
     for(int j=0;j<=i;j++){
      System.out.print(++k);
      System.out.print(" ");}
    System.out.println();}
    }
    
}
