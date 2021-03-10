
package javaapplication3;
import java.util.*;
public class VetorExercicio15 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
int I,T,P;
 int[] vet=new int[10];   
 int[] vet1=new int[10];   
 int[] vet2=new int[20]; 
 int[] vet3=new int[10]; 
   
   for(I=0;I<vet.length;I++){ vet[I]= (int)(Math.random()*10+1); vet1[I]= (int)(Math.random()*10+1);}
   for(I=0,T=9;I<vet.length;I++,T++){ vet2[I]=vet[I]; vet2[T]=vet[I];  }
    for(I=0,P=5;I<5;I++,P++){  vet3[I]=vet[I]; vet3[P]=vet1[I];  }
    
   for(I=0;I<vet.length;I++){ System.out.println("V1 \t"+vet[I]); }
 for(I=0;I<vet1.length;I++){ System.out.println("V2 \t"+vet1[I]);}
  for(I=0;I<vet2.length;I++){ System.out.println("V2 \t"+vet2[I]);}
   for(I=0;I<vet3.length;I++){ ;System.out.println("V3 \t"+vet3[I]);}
   
   }}
