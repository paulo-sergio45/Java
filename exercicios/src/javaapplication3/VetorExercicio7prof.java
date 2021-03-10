import java.util.*;
public class VetorExercicio7prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("N:");
		int n = s.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*10 + 1);
			b[i] = (int)(Math.random()*10 + 1);
			c[i] = a[i] + b[i];
			System.out.printf("%2d + %2d = %2d\n",a[i],b[i],c[i]);
		}

	}

}
