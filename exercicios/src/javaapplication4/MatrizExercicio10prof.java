package javaapplication4;


public class MatrizExercicio10prof {

	public static void main(String[] args) {
		float[][] m = new float[12][13];
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (int)(Math.random()*10+1);
				System.out.printf("%.2f\t",m[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i=0;i<m.length;i++){
			float maior = Math.abs(m[i][0]);
			for(int j=0;j<m[i].length;j++){
				if (Math.abs(m[i][j]) > maior)
					maior = Math.abs(m[i][j]); 
			}
			
			for(int j=0;j<m[i].length;j++){
				m[i][j] = m[i][j]/maior; 
				System.out.printf("%.2f\t",m[i][j]);
			}
			System.out.println();
		}
		

	}

}
