public class VetorExercicio8prof {

	public static void main(String[] args) {
		int[] v = new int[20];
		
		System.out.print("[");
		for(int i=0;i<v.length;i++){
			v[i] = (int)(Math.random()*10+1);
			System.out.printf("%2d ",v[i]);
			
		}
		System.out.print("]");
		
		int aux;
		int n =v.length;  
		for(int i=0;i<n/2;i++){
			aux = v[n-(i+1)];
			v[n-(i+1)]=v[i];
			v[i] = aux;
		}
		
		System.out.print("\n[");
		for(int i=0;i<v.length;i++){
			System.out.printf("%2d ",v[i]);
		}
		System.out.print("]");


	}

}
