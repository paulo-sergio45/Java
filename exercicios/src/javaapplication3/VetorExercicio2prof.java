import java.util.Scanner;

public class VetorExercicio2prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] =  (int)((Math.random()*10)+1);
		}
		
		System.out.print("Informe um valor:");
		int m = s.nextInt();
		
		int posicao = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == m){
				posicao = i;
				break;
			}
		}
		
		System.out.print("[ ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println("]");
		
		if (posicao == -1)
			System.out.println("Valor n�o localizado no vetor");
		else
			System.out.println("Valor na posi��o:" + posicao);

	}

}
