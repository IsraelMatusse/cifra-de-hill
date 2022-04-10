package CifradeHill;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int linha2,coluna2;
	
		System.out.println("qual e o numero de linhas");
		int linha=teclado.nextInt();
		System.out.println("qual e o numero de colunas");
		int coluna=teclado.nextInt();
		if(linha==coluna) {
		int[][] matrizA= new int[linha][coluna];
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				System.out.println("Digite o valor da matriz");
				matrizA[i][j]=teclado.nextInt();
			}
		}
		System.out.println("qual e o numero de linhas");
		 linha2=teclado.nextInt();
		System.out.println("qual e o numero de colunas");
		 coluna2=teclado.nextInt();
		 int matrizB[][]= new int[linha2][coluna2];
		if(linha2==coluna2) {
		for(int i=0; i<linha2; i++) {
			for(int j=0; j<coluna2; j++) {
				System.out.println("Digite o valor da matriz");
				matrizB[i][j]=teclado.nextInt();
			}}
		System.out.println("Matriz A");
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				System.out.print(matrizA[i][j] +" ");		
			}
			System.out.println("");
		}
		
		System.out.println("Matriz B");
		for(int i=0; i<linha2; i++) {
			for(int j=0; j<coluna2; j++) {
				System.out.print(matrizB[i][j] +" ");		
			}
			System.out.println("");
		}
		
		int matrizC[][]= new int[linha][coluna2];
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna2; j++) {
				for(int k=0; k<linha2; k++) {
					matrizC[i][j]+=matrizA[i][k]*matrizB[k][j];
				}
			}
		}
		
		System.out.println("Matriz C");
		
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna2; j++) {
			//	for(int k=0; k<linha2; k++) {
					System.out.print(matrizC[i][j] +" ");	
				}	
			System.out.println("");
		}
		
	}else {
		System.out.println("A matriz introduzida nao e quadrada");
	}
		}else {
			System.out.println("A matriz introduzida nao e quadrad");
		}

}
}