
package javaapplication3;
import java.util.*;
public class VetorExercicio12 {
      public static void main(String[] args){
  Scanner scan=new Scanner (System.in);
  int I,N,R=0,A=0,A1=1,A2=0,A3=0,M;
  
      System.out.println("tamanho vetor");
      N =scan.nextInt();
         
 int[] vet=new int[N] ;
 
      for(I=0;I<vet.length;I++){   
          
     // System.out.println("altura");
     // vet[I]=(int) scan.nextDouble();    R+=vet[I];
     vet[I] = (int)(Math.random()*2.70); 
     
      if(vet[I]>A){ A=vet[I]; }
      if(vet[I]<A1){A1=vet[I];}
      if(vet[I]>1.60){A2++;}
      if(vet[I]<1.30){A3++;}    
      }  
      M=R/N;
       for(I=0;I<vet.length;I++){ System.out.println(vet[I]);} 
          System.out.println("maior altura \t"+A);   
          System.out.println("menor altura \t"+A1);
          System.out.println("maior que 1,60 \t"+A2);
          System.out.println("menor que 1,30 \t"+A3);
      
}}
