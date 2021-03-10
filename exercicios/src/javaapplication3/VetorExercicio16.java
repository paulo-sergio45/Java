
package javaapplication3;
import java.util.*;
public class VetorExercicio16 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int F=0,N=0,I,R=0;
    
         System.out.println("vetor N");
         N=scan.nextInt();
       int[] vet=new int[N];
      int[] veti=new int[N];
      
         for(I=0;I<vet.length;I++) {  
             System.out.println("valor");
           vet[I]=scan.nextInt();   
         
        int X=vet[I],X1=vet[I];
         
 for(;X>1;X--){ R=X1*(X-1); X1=R; veti[I]=X1; } }
 
          for(I=0;I<vet.length;I++){System.out.println("vetor"+vet[I]);}
   for(I=0;I<vet.length;I++){System.out.println("fatoria"+veti[I]);}
}}
