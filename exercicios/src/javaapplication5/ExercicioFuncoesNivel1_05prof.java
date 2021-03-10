
public class ExercicioFuncoesNivel1_05prof {

	public static void main(String[] args) {
		System.out.println(ContarDias(31, 8));

	}
	
	static int ContarDias(int dia,int mes){
		int resultado = (mes-1)*30+dia;
		return resultado;
	}

}
