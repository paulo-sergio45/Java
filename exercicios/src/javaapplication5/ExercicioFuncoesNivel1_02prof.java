public class ExercicioFuncoesNivel1_02prof {
	
	public static void main(String[] args) {
		System.out.println("5!=" + Fatorial(5));
	}
	
	static long Fatorial (int valor){
		long fat = 1;
		for(int i=valor;i>0;i--){
			fat = fat * i;
		}
		return fat;
	}
	
}
