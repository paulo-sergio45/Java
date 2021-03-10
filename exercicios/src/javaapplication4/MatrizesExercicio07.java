
package javaapplication4;


public class MatrizesExercicio07 {
     public static void main(String[] args) {
         int vet[][]=new int[4][9];
         int A=0;
          for (int I = 0; I < vet.length; I++) {
            for (int J = 0; J < vet[I].length; J++) {
                vet[I][J] = (int) (Math.random() * 10 + 1);
                System.out.print("\t"+vet[I][J]);}System.out.print("\n");}
          for (int I = 0; I < vet.length; I++) {
            for (int J = 0; J < vet[I].length; J++) { 
            
                if(I%2!=0){  A+=vet[I][J];     }}}
          
         System.out.println("soma"+A);
            }}  
