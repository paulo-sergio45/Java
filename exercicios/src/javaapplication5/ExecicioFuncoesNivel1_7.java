package javaapplication5;

import java.util.Scanner;

public class ExecicioFuncoesNivel1_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("numero de alunos");
        int n = scan.nextInt();

        String[] veti = new String[n];
        int[] vetr = new int[n];
        int[] vet = new int[n];
        int[] veto = new int[n];

    
        veti = nome(n);
        veto = nota1(n,veti);
        vet = nota(n,veti);
        vetr = media(n,vet,veto);
        
          for (int i = 0; i < veti.length; i++) {
              System.out.print("aluno \t"+veti[i]+"\t"+"nota: \t"+"1°"+"="+veto[i]+"\t"+"2°"+"="+vet[i]+"\t"+"media="+veto[i]+"\n");
          }  
    }

    static String[] nome(int n) {
        Scanner scan = new Scanner(System.in);

        String[] veti = new String[n];

        for (int i = 0; i < veti.length; i++) {

            System.out.print("nome:");
            veti[i] = scan.next();
        }

        return veti;
    }

     static int[] nota1(int n, String veti[]) {
         Scanner scan = new Scanner(System.in);
         
         int[] veto = new int[n];
         
         for (int i = 0; i <veto.length;i++ ) {

            System.out.println("notas 1° do(a) "+veti[i] );
            veto[i] = scan.nextInt();
           
        }
         return veto;
     }
     
    static int[] nota(int n, String veti[]) {
        Scanner scan = new Scanner(System.in);
   
        
        int[] vet = new int[n];
        
        
        for (int i = 0; i<vet.length;i++ ) {

            System.out.println("notas 2º do(a) "+veti[i] );
            vet[i] = scan.nextInt();
           
        }
        
      
        return vet;

    }

    static int[] media(int n, int vet[],int veto[]) {

        int[] vetr = new int[n];
        
        for (int i = 0; i < vet.length; i++) {
            
          vetr[i] = vet[i] + veto[i] / 2;
        }
        return vetr;
    }

}
