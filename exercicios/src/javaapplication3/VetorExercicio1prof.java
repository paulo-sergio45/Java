import java.util.Scanner;
public class VetorExercicio1prof {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int[] vetor = new int[5];
	   
	   for (int i = 0; i < vetor.length; i++) {
		   System.out.print("Informe um inteiro:");
		   vetor[i] = s.nextInt();
	   }
	   
	   int conta = 0;
	   
	   for (int i = 0; i < vetor.length; i++) {
		   System.out.println(vetor[i]);
		   
		   if (vetor[i] < 0)
			   conta++;
	   }
	   
	   System.out.println("Total de valores negativos:" + conta);

	}

}
