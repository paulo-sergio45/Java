import java.util.*;
public class VetorExercicio5prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe N:");
		int n = s.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			double d = Math.random();
			vetor[i] = (int)(d*100+1);
			System.out.println(d + "\t" + vetor[i]);
			//System.out.print(vetor[i]+"\t");
		}
		
		

	}

}
