
package javaapplication4;

import java.util.*;


public class MatrizesExericicio04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
        int vet[][]=new int[10][10];
        int veti[][]=new int[10][10];
        int I,J = 0,A=0,A1=0;
        for(I=0;I<vet.length;I++){for(J=0;J<vet[I].length;J++){ 
        vet[I][J]=(int)(Math.random()*10)+1;
        System.out.print(" \t "+vet[I][J]);}System.out.print(" \n "); }
        
        for(I=1,A=0;I<vet[1][9];I++,A++)
        {for(J=0,A1=0;J<vet[1].length;J++,A1++){
        if(veti[I][J]==vet[A][A1]){veti[A][A1]=vet[I][J]; }}} 
      
      
        
        System.out.println("  ");
        
         for(A=0;A<veti.length;A++){for(A1=0;A1<veti[A].length;A1++)
         {System.out.print("\t"+veti[A][A1]);}System.out.println("\n");}
       
         
     //   for(I=0;I<vet.length;I++){for(J=0;J<vet[I].length;J++){ 
    //    System.out.print(" \t "+vet[I][J]);}System.out.print(" \n "); }
        
}}
