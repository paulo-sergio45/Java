package javaapplication4;


public class MatrizesExericicio02prof {

	public static void main(String[] args) {
		int[][] m = new int[5][5];
		
		System.out.println("[");
		for(int i=0;i<m.length;i++){
			//Varre Colunas
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (int)(Math.random()*10 + 1);
				System.out.printf("%2d ",m[i][j]);
			}
			System.out.println();
		}
		System.out.println("]");
		
		int soma4=0,soma2=0,somap=0,somat=0;
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				if (i == 4){
					soma4 += m[i][j];
				}
				if (j == 2){
					soma2 += m[i][j];
				}
				if (i == j){
					somap += m[i][j];
				}
				
				somat += m[i][j];
					
			}
		}
		
		System.out.println("Linha 4:" + soma4);
		System.out.println("Coluna 2:" + soma2);
		System.out.println("Diagonal Principal:" + somap);
		System.out.println("Soma Total:" + somat);

	}

}
