import java.util.*;
public class VetorExercicio9prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("N:");
		int n = s.nextInt();
		
		int[] v = new int[n];
		
		for(int i=0;i<v.length;i++){
			v[i] = (int)(Math.random()*10+1);
			System.out.print(v[i] + " ");
		}
		
		int menor = v[0];
		int maior = v[0];
		int soma = 0;
		
		for(int i=0;i<v.length;i++){
			soma += v[i];
			
			if (v[i] > maior)
				maior = v[i];
			
			if (v[i] < menor)
				menor = v[i];
		}
		System.out.println();
		System.out.println("Maior:" + maior);
		System.out.println("Menor:" + menor);
		System.out.println("Media:" + (soma/(double)n));
		
		
		
	}

}
