import java.util.Scanner;
public class VetorExercicio3prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] v = new int[6];
		
		for (int i = 0; i < v.length; i++) {
			System.out.print("Informe um valor:");
			v[i] = s.nextInt();
		}
		
		String par = "";
		String impar = "";
		int conta_par = 0;
		int conta_impar = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i]%2==0){
				conta_par++;
				par += v[i] + " ";
			}else{
				conta_impar++;
				impar += v[i] + " ";
			}
		}
		
		System.out.print("Pares(" + conta_par + "):" + par);
		System.out.println();
		System.out.print("Impares(" + conta_impar + "):" + impar);
		

	}

}
