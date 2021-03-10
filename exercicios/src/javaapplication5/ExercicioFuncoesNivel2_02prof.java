import java.util.Scanner;
import java.util.Calendar;


public class ExercicioFuncoesNivel2_02prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia,mes,ano;
		int[] idade;
		System.out.print("Dia/Mes/Ano:");
		dia = s.nextInt();
		mes = s.nextInt();
		ano = s.nextInt();
		idade = CalcularIdade(dia,mes,ano);
		System.out.printf("Idade:%d anos, %d mes(es) e %d dia(s)",
				idade[2],idade[1],idade[0]);
				
		

	}
	
	static int[] CalcularIdade(int diaA,int mesA,int anoA){
		int[] resultado = new int[3];
		
		Calendar c = Calendar.getInstance();
		int diaR = c.get(Calendar.DAY_OF_MONTH);
		int mesR = c.get(Calendar.MONTH)+1;
		int anoR = c.get(Calendar.YEAR);
		
		long totalDiasA = diaA + (mesA-1)*30 + anoA*360;
		long totalDiasR = diaR + (mesR-1)*30 + anoR*360;
		long dif = totalDiasR - totalDiasA;
		
		resultado[2] =  ((int)dif)/360;
		resultado[1] =  (((int)dif)%360)/30;
		resultado[0] =  (((int)dif)%360)%30;
				
		
		
		return resultado;
	}

}
