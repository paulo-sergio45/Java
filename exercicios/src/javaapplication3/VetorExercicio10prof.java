import java.util.*;
public class VetorExercicio10prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float maior1 = 0;
		float maior2 = 0;
		float altura = 0;
		
		do{
			System.out.print("Informe altura:");
			altura = s.nextFloat();
			if (altura > 0){
				if (maior2 < altura){
					maior2 = altura;
				}
				
				if (maior2 > maior1){
					float aux = maior1;
					maior1 = maior2;
					maior2 = aux;
				}
			}else{
				if (altura < 0)
				{
					System.out.println("Valor inv�lido");
					altura = 0.1f;
				}
			}
		}while(altura > 0);
		
		System.out.println("1� maior:" + maior1);
		System.out.println("2� maior:" + maior2);
		

	}

}
