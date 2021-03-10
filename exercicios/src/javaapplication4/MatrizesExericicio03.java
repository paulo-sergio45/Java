
package javaapplication4;
import java.util.*;

public class MatrizesExericicio03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vet[][] =new int[5][5];
        
        int I,J,A=0,S1=0,S2=0,S3=0,S4=0,S5=0,S6=0,S7=0,S8=0,S9=0,S10=0;
       for(I=0;I<vet.length;I++){ 
         for(J=0;J<vet[I].length;J++){  
           vet[I][J]= (int)(Math.random()*10)+1; 
             System.out.print( "\t" +vet[I][J]);} System.out.print("\n");}
       
        for(I=0;I<vet.length;I++){ 
         for(J=0;J<vet[I].length;J++){
         ///   if(vet[I]==vet[J]){veti[A]=vet[I][J]; A++;}  
         if(vet[I][J]==1){S1++;}
         if(vet[I][J]==2){S2++;}
         if(vet[I][J]==3){S3++;}
         if(vet[I][J]==4){S4++;}
         if(vet[I][J]==5){S5++;}
         if(vet[I][J]==6){S6++;}
         if(vet[I][J]==7){S7++;}
         if(vet[I][J]==8){S8++;}
         if(vet[I][J]==9){S9++;}
         if(vet[I][J]==10){S10++; }
         }}
        System.out.println("\n");
        System.out.println("1 Rep. \t ="+S1);
         System.out.println("2 Rep. \t ="+S2);
          System.out.println("3 Rep. \t ="+S3);
           System.out.println("4 Rep. \t ="+S4);
            System.out.println("5 Rep. \t ="+S5);
             System.out.println("6 Rep. \t ="+S6); 
              System.out.println("7 Rep.\t ="+S7);
              System.out.println("8 Rep.\t ="+S8);
               System.out.println("9 Rep. \t ="+S9);
                System.out.println("10 Rep.\t ="+S10);
        
}
}