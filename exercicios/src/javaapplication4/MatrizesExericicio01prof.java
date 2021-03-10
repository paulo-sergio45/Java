package javaapplication4;

import java.util.*;
public class MatrizesExericicio01prof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] m = new int[6][6];
		
		for(int i=0;i<m.length;i++){
			//Varre Colunas
			for(int j=0;j<m[i].length;j++){
				m[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Informe A:");
		int a = s.nextInt();
		
		for(int i=0;i<m.length;i++){
			//Varre Colunas
			for(int j=0;j<m[i].length;j++){
				m[i][j] = m[i][j]*a;
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
