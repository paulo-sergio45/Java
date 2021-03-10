
public class VetorExercicio13prof {

	public static void main(String[] args) {
		float[] valores = new float[20];
		float media = 0;
		for(int i=0;i<valores.length;i++){
			valores[i] = (float)Math.random()*10;
			System.out.printf("%.2f\n",valores[i]);
			media += valores[i];
		}
		
		media = media / valores.length;
		
		System.out.printf("M�dia:%.2f\n",media);
		
		float soma = 0;
		
		for(int i=0;i<valores.length;i++){
			soma += Math.pow(valores[i]-media,2);
		}
		
		float variancia = soma / valores.length;
		float desviop = (float)Math.sqrt(variancia);
		
		System.out.printf("Vari�ncia:%.2f\n",variancia);
		System.out.printf("Desvio Padr�o:%.2f\n",desviop);
		
		

	}

}
