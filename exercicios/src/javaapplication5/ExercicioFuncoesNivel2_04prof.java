import java.util.Scanner;


public class ExercicioFuncoesNivel2_04prof {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Altura:");
		double h = s.nextDouble();
		System.out.print("Sexo:");
		char sexo = s.next().charAt(0);
		System.out.printf("Peso ideal: %.2f",CalcularPesoIdeal(sexo, h));
		
	}
	
	static double CalcularPesoIdeal(char sexo,double altura){
		double pesoIdeal = 0;
		
		if (sexo == 'm' || sexo == 'M'){
			pesoIdeal = (72.7*altura)-58;
		}else{
			pesoIdeal = (62.1*altura)-44.7;
		}
		
		return pesoIdeal;
	}
}
