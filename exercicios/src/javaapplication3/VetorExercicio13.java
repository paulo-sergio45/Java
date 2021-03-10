package javaapplication3;

import java.util.*;

public class VetorExercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, N, n, E, Xi, X, XM;
        System.out.println("N");
        N = scan.nextDouble();
        System.out.println("n");
        n = scan.nextDouble();
        System.out.println("E");
        E = scan.nextDouble();
        System.out.println("Xi");
        Xi = scan.nextDouble();
        System.out.println("X");
        X = scan.nextDouble();

        //XM=Math.pow((Xi-X),2);
        A = Math.sqrt(N / 1 * (Math.pow(E / 1, N)) * (Math.pow((Xi - X), 2)));

        System.out.println("Resutado /t" + A);
    }
}
