import java.util.*;
public class VetorExercicio11prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("N:");
		int n = s.nextInt();
		int[] v = new int[n];
		
		for(int i=0;i<v.length;i++){
			System.out.print("Informe valor:");
			v[i] = s.nextInt();
		}
		
		for(int i = v.length-1; i>=0;i--)
			System.out.println(v[i]);

	}

}
