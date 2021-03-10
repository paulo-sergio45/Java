import java.util.Scanner;


public class ExercicioFuncoesNivel2_05prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Tipo e n1,n2,n3:");
		char t = s.next().charAt(0);
		double n1 = s.nextDouble();
		double n2 = s.nextDouble();
		double n3 = s.nextDouble();
		
		System.out.printf("Media:%.2f",CalcularMedia(t, n1, n2, n3));
	}
	
	static double CalcularMedia(char tipo,double n1,double n2,double n3){
		double media = 0;
		
		if (tipo == 'p' || tipo == 'P'){
			media = (n1*3 + n2*3 + n3*4)/10;
		}
		else if (tipo == 'a' || tipo == 'A'){
			media = (n1 + n2 + n3)/3;
		}
		
		return media;
	}

}
