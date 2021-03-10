package javaapplication4;


public class MatrizesExercicio08_2prof {

	public static void main(String[] args) {
		double[][] m = new double[50][50];
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (Math.random()*10+1);
				System.out.printf("%.2f\t",m[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			double d = m[i][i];
			
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = m[i][j] * d;
				System.out.printf("%.2f\t",m[i][j]);
			}
			System.out.println();
		}


	}

}
