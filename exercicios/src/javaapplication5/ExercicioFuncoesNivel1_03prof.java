
public class ExercicioFuncoesNivel1_03prof {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			System.out.printf("%2d� - %.2f�\n",i,CtoF(i));
		}

	}
	
	static float CtoF(float celsius){
		float f = 1.8f*celsius + 32;
		return f;
	}

}
