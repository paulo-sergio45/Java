import java.util.*;
public class VetorExercicio4prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float[] vetor = new float[10];
		int qtNegativos = 0;
		float somaPositivos = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor " + (i+1) + ":");
			vetor[i] = s.nextFloat();
			
			if (vetor[i] < 0){
				qtNegativos++;
			}else{
			   somaPositivos += vetor[i];		
			}
		}
		
		System.out.println("Quantidade negativos:" + qtNegativos);
		System.out.println("Soma dos positivos:" + somaPositivos);
		
		

	}

}
