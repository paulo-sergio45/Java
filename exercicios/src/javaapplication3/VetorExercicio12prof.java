
public class VetorExercicio12prof {

	public static void main(String[] args) {
		float[] alturas = new float[1000];
		
		float maior;
		float menor;
		float soma = 0;
		int contaMaior160 = 0;
		int contaMenor130 = 0;
		for(int i=0;i<alturas.length;i++){
			alturas[i] = 1.20f + (float)Math.random();
			soma += alturas[i];
			
			if (alturas[i] > 1.60)
				contaMaior160++;
			
			if (alturas[i] < 1.30)
				contaMenor130++;
		}
		
		maior = alturas[0];
		menor = alturas[0];
		
		for(int i=0;i<alturas.length;i++){
			if (alturas[i] > maior)
				maior = alturas[i];
			if (alturas[i] < menor)
				menor = alturas[i]; 
		}
		
		
		System.out.printf("Maior:%.2f\n",maior);
		System.out.printf("Menor:%.2f\n",menor);
		System.out.printf("M�dia:%.2f\n",(soma / alturas.length));
		System.out.println("Qt. Maiores 1.60:" + contaMaior160);
		System.out.println("Qt. Menores 1.30:" + contaMenor130);

	}

}
