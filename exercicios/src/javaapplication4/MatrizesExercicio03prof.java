package javaapplication4;


public class MatrizesExercicio03prof {

    public static void main(String[] args) {

        int[][] m = new int[5][5];
        int[] v = new int[m.length * m.length];
        String index = "";

        int l = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 10 + 1);
                v[l] = m[i][j];
                l++;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < v.length; i++) {
            int conta = 0;

            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) {
                    conta++;
                }
            }

            if (conta >= 2 && !index.contains(";" + v[i])) {
                index = index + ";" + v[i];
                System.out.println("Valor " + v[i] + " repete " + conta + " vezes (" + index + ")");
            }
        }

    }

}
