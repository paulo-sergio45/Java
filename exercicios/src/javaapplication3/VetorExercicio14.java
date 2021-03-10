package javaapplication3;

import java.util.*;

public class VetorExercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int N,I,R=0;  
      
        System.out.println("tamanho do vetor");
        N=scan.nextInt();
        
    int vet[]=new int[N];
    int vet1[]=new int[N];   
        
  //  for(I=0;I<vet.length;I++){   
  //      System.out.println("valor do vetor");
  //      vet[I]=scan.nextInt();      
 //    System.out.println("valor do vetor");
  //      vet1[I]=scan.nextInt(); }
  for(I=0;I<vet.length;I++){ vet[I]=(int) (Math.random()*10+1); vet1[I]=(int) (Math.random()*10+1); }
    
     for(I=0;I<vet.length;I++){  R+=vet[I]*vet1[I];              }   
     for(I=0;I<vet.length;I++){System.out.println("vetor1 \t"+vet[I]); }   
     for(I=0;I<vet.length;I++){System.out.println("vetor2 \t"+vet1[I]); }    
        System.out.println("produto \t"+R);
        
}}
