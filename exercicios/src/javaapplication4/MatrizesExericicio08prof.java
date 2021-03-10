package javaapplication4;


public class MatrizesExericicio08prof {

	public static void main(String[] args) {
		double[][] m = new double[50][50];
		double[] d = new double[m.length];
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (Math.random()*10+1);
				
				if (i == j)
					d[i] = m[i][j];
				
				System.out.printf("%.2f\t",m[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=0;i<d.length;i++){
			System.out.printf("%.2f\t",d[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = m[i][j]*d[i];
				System.out.printf("%.2f\t",m[i][j]);	
			}
			System.out.println();
		}

	}
}
