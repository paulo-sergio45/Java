package javaapplication4;


public class MatrizesExericicio07prof {

	public static void main(String[] args) {
		int[][] m = new int[4][9];
		int soma = 0;
		for(int i=0;i<m.length;i++){
			System.out.print("Linha " + (i+1) + ":\t");
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (int)(Math.random()*10+1);
				System.out.print(m[i][j] + "\t");
				
				if ((i+1)%2==0){
					soma += m[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("Soma:" + soma);
	}

}
