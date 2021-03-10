import java.util.*;

public class ExercicioFuncoesNivel1_01prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nota 1:");
		double n1 = s.nextDouble();
		System.out.print("Nota 2:");
		double n2 = s.nextDouble();
		
		System.out.println("Media=" + CalcularMedia(n1,n2));
				

	}
	
	static double CalcularMedia(double nota1,double nota2){
		double media = (nota1+nota2)/2;
		return media;
	}


}

