package javaapplication4;

import java.util.Scanner;

public class MatrizesExercicio13 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
      

        System.out.println("velha" + velha());

    }

   public static int[][] velha() {
        int i = 0, j = 0, n = 0;

        int[][] vet = new int[3][3];

        for (i = 0; i < vet.length; i++) {

            for (j = 0; j < vet[i].length; j++) {
                n++;

                vet[i][j] = n;

                System.out.print("\t" + vet[i][j]);

            }
            System.out.print("\n");
        }
        
        

        return vet;
    }
}
