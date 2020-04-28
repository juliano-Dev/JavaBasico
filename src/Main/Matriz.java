package Main;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("Informe o número de linhas da matriz: ");
		int m = s.nextInt();
		System.out.printf("Informe o número de colunas da matriz: ");
		int n = s.nextInt();
		int [][] matriz = new int[m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matriz[i][j]+" ");				
			}
		}
		
		System.out.printf("Busque um número na matriz: ");
		int x = s.nextInt();
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					if(j > 0) System.out.println("A esquerda: "+matriz[i][j-1]);
					if(i > 0) System.out.println("A cima: "+matriz[i-1][j]);
					if(j < matriz[i].length - 1) System.out.println("A direita: "+matriz[i][j+1]);
					if(i < matriz[i].length - 1) System.out.println("A baixo: "+matriz[i+1][j]);
				}				
			}
		}
		
		
		
		
		s.close();
	}

}
