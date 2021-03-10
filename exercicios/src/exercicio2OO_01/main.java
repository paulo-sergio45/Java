
package exercicio2OO_01;
import exercicio2OO_01.aluno;
import java.util.Scanner;


public class main {
     public static void main(String[] args) { 
         Scanner scan = new Scanner(System.in);
         int n=0;
         System.out.println("quantidade de notas");
         n =scan.nextInt();
         
aluno a=new aluno(n);

  System.out.println("nome");
         String nome =scan.next();
         
        System.out.println("matricula");
         String matricula =scan.next();
         
         double notas=0;
         
         for (int i = 0; i < n; i++) {
          System.out.println(" notas");
           notas = scan.nextDouble();
         }
       a.setNome(nome);
       a.setMatricula(matricula);
       a.adicionarnotas(notas);
      
         a.setmedia();
         a.Print();
         
}
}