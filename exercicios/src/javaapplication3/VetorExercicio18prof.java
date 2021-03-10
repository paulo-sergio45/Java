import java.util.*;
public class VetorExercicio18prof {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe n:");
		n = s.nextInt();
		
		long[] fibo = new long[n];
		
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int i=2;i<n;i++)
			fibo[i] = fibo[i-1]+fibo[i-2];
		
		
		for(int i=0;i<n;i++)
		  System.out.println(fibo[i]);
			

	}

}
