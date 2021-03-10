/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexidadealgoritmos;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class ComplexidadeAlgoritmos {

    public static void main(String[] args) {
        /*   int n = Funcao2Exe1(54180, 13125);
        ArrayList vet = Funcao1Exe1(54180, 13125);
        System.out.println("" + vet);*/
        //System.out.println( FibonacciRecuExe2(100));
        //System.out.println( FibonacciInteExe3(10000));
        // System.out.println(FibonacciMatrizExe4(10000));
        // System.out.println(FibonacciMatrizExe4(70));ProdutoPandQExe6
        MatrizQuaExe9();
        ///  int[] vet = new int[1000];
        //   for(int i = 0; i < vet.length; i++) {
        //     int rnd = (int) (1 + Math.random() * 100); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
        //    vet[i] = rnd; // atribui o valor a cada indice do vetor
        //     }
        //   OrdenarVetorDiretaPar3Exe10(vet);
        //=System.out.println(DeterminaMenorElementoPar1Exe10(vet));
        //System.out.println((MedianaPar2Exe10(vet)));
    }

    public static ArrayList Funcao1Exe1(int x, int y) {
        int t = 0, j = 0;
        ArrayList vet = new ArrayList();
        /*parte 1*/
        ArrayList vetA = new ArrayList();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                j++;
                vetA.add(i);
            }
        }
        vet.add(vetA);
        j = 0;
        ArrayList vetB = new ArrayList();
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                j++;
                vetB.add(i);
            }
        }
        vet.add(vetB);
        /*parte 2*/
        ArrayList vetC = new ArrayList();
        for (int i = 0; i < vetB.size(); i++) {
            if (vetA.contains(vetB.get(i))) {

                vetC.add(vetB.get(i));
            }
        }
        vet.add(vetC);
        /*parte 3*/
        int n = 0;
        for (int i = 0; i < vetC.size(); i++) {
            if (n < (int) vetC.get(i)) {
                n = (int) vetC.get(i);
            }

        }
        vet.add(n);
        return vet;
    }

    public static int Funcao2Exe1(int x, int y) {
        /*parte verificando se e mdc para teste*/
        int t;

        if (x < y) {
            t = x;
        } else {
            t = y;

        }
        while (x % t != 0 || y % t != 0) {
            t++;

        }

        return t;
    }

    public static int Funcao3Exe1(int x, int y) {
        int n;
        if (y == 0) {
            n = x;
        } else {
            n = Funcao3Exe1(y, x % y);
        }

        return n;
    }

    public static int Funcao4Exe1(int x, int y) {
        int t;
        int n;
        for (int i = 0; y != 0; i++) {
            t = x % y;
            x = y;
            y = t;
        }
        n = x;
        return n;
    }

    public static double FibonacciRecuExe2(double n) {
        if (n < 2.0) {
            return n;
        } else {
            return FibonacciRecuExe2(n - 1) + FibonacciRecuExe2(n - 2);
        }
    }

    public static double FibonacciInteExe3(double n) {
    //long startTime = System.nanoTime();   
        double i = 0, j = 1;
        for (int k = 1; k < n; k++) {
            j = i + j;
            i = j - i;
        }
        //     long estimatedTime = System.nanoTime() - startTime;
        //    System.out.println(estimatedTime);
        return j;
    }

    public static double FibonacciMatrizExe4(int n) {
        //long startTime = System.nanoTime();    
        long[][] mat = {{1, 0}, {0, 1}};
        long[][] mat2 = {{1, 1}, {1, 0}};
        boolean l = true;
        if (n < 2) {
            return n;
        } else {
            while (l) {
                if (n <= 0) {
                    l = false;
                } else {
                    if (n % 2 == 1) {
                        long[][] aux2 = {{mat[0][0] * mat2[0][0] + mat[0][1] * mat2[1][0],
                            mat[0][0] * mat2[0][1] + mat[0][1] * mat2[1][1]},
                        {mat[1][0] * mat2[0][0] + mat[1][1] * mat2[1][0],
                            mat[1][0] * mat2[0][1] + mat[1][1] * mat2[1][1]}};
                        mat = aux2;
                    }
                    long[][] aux = {{mat2[0][0] * mat2[0][0] + mat2[0][1] * mat2[1][0],
                        mat2[0][0] * mat2[0][1] + mat2[0][1] * mat2[1][1]},
                    {mat2[1][0] * mat2[0][0] + mat2[1][1] * mat2[1][0],
                        mat2[1][0] * mat2[0][1] + mat2[1][1] * mat2[1][1]}};
                    mat2 = aux;

                    n = n / 2;
                }
            }
        }

        //long estimatedTime = System.nanoTime() - startTime;
        //        System.out.println(estimatedTime);
        return mat[0][1];

    }

    public static double ProdutoPandQExe6(int x, int y) {
        double n = 0;

        if (x > y) {
            while (x > 0) {
                if (x % 2 == 1) {
                    n += y;
                }
                x = x / 2;
                y = y * 2;
            }
        } else {
            while (y > 0) {
                if (y % 2 == 1) {
                    n += x * 2;
                }
                y = y / 2;
                x = x * 2;

            }
        }
        return n;
    }

    public static double PalindromosExe7(int n) {
        int i = 0;
        boolean l = true;
        while (l) {

            int nor = n;
            i = 0;
            while (nor > 0) {
                i *= 10;
                i += (nor % 10);
                nor /= 10;
            }
            if (i == n) {
                l = false;
            }
            n = n + i;

        }
        return i;

    }

    public static double PotenciaLogarítmicaExe8(int n, int n2) {
        double pot = 1;
        double pot2 = n;
        boolean l = true;
        if (n2 == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            while (l) {
                if (n2 <= 0) {
                    l = false;
                } else {
                    if (n2 % 2 == 1) {

                        pot = pot * pot2;
                        System.out.println(pot);
                    }

                    pot2 = pot2 * pot2;

                    n2 = n2 / 2;
                }

            }
        }
        return pot;

    }

    public static void MatrizQuaExe9() {
        //teste com matriz 4X4 
        ///    int cont=0;
        int matA[][] = {{2,2,2,2},{2,2,2,2},{2,2,2,2},{2,2,2,2}};
        int matB[][] = matA;
        int matC[][] = new int[4][4];
        //teste com matriz 4X4 
        for (int i = 0; i < matC.length; i++) {

            for (int j = 0; j < matC[i].length; j++) {

                for (int k = 0; k < matA[i].length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                    ///     cont++;
                }

            }
        }
        ///   System.out.println(cont);
        for (int i = 0; i < matC.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matC[i].length; j++) {
                System.out.print(matC[i][j] + " ");
            }
        }

    }

    public static int DeterminaMenorElementoPar1Exe10(int[] vet) {
        int n = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < n) {
                n = vet[i];
            }
        }
        return n;

    }

    public static int MedianaPar2Exe10(int[] vet) {
        boolean l = true;
        int posi = 0;
        int posi1 = 0;
        int n = vet[0];
        int n2 = vet[vet.length - 1];
        for (int k = 0; l; k++) {

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] < n && vet[i] != 0) {
                    n = vet[i];
                    posi1 = i;
                }
            }

            for (int j = vet.length - 1; j >= 0; j--) {
                if (vet[j] > n2 && vet[j] != 0) {
                    n2 = vet[j];
                    posi = j;
                }

            }
            vet[posi1] = 0;
            vet[posi] = 0;
            if (n == n2) {
                l = false;
            }
            n = n2;
            n2 = 0;
        }
        return n;
    }

    public static int[] OrdenarVetorDiretaPar3Exe10(int[] vet) {
        int i, j, m, t;

        for (i = 0; i < vet.length - 1; i++) {

            m = i;//cont++;
            for (j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[m]) {
                    m = j;//cont++;
                }
            }
            t = vet[m];
            vet[m] = vet[i];
            vet[i] = t;
        }

        return vet;
    }

}
