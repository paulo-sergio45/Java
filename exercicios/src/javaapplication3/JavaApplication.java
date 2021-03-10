package javaapplication3;

import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("numero");
        
        int f = scan.nextInt();

        System.out.println("resultado: " + fator(f));
    }

    static int fator(int f) {

        int i, n = f, r = 0;

        for (i = 0; i <= n; i++) {

            r += (f * (n - 1));
        }
        return r;
    }
}
