package javaapplication4;


public class MatrizesExercicio05prof {

	public static void main(String[] args) {
		int[][] m = new int[10][10];
		int soma = 0;
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (int)(Math.random()*10+1);
				System.out.print(m[i][j] + "\t");
				
				if (i == j)
					soma+=m[i][j];
					
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Media=" + (soma /(double)m.length));
	}

}
