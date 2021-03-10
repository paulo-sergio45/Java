import java.util.*;
public class VetorExercicio16prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe n:");
		int n = s.nextInt();
		
		int[] v = new int[n];
		long[] f = new long[n];
		
		for(int i=0;i<v.length;i++){
			System.out.print("Informe valor:");
			v[i] = s.nextInt();
			
			if (v[i] < 0)
				v[i] = 0;
			
			f[i] = 1;
			
			for(int j=v[i];j>0;j--)
				f[i] = f[i] * j;
			
		}
		
		for(int i=0;i<v.length;i++){
			System.out.println(v[i] + "\t" + f[i]);
		}
		
	}

}
