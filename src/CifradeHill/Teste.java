package CifradeHill;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Digite a palavra a ser cifrada");
		String palavra =teclado.next();
		
		System.out.println("qual e o numero de linhas");
		int linha=teclado.nextInt();
		System.out.println("qual e o numero de colunas");
		int coluna=teclado.nextInt();
		if(linha==coluna) {
		int[][] key= new int[linha][coluna];
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				System.out.println("Digite o "+ "* valor da linha");
				key[i][j]=teclado.nextInt();
			}
		}	
		int blocoSize = linha;
	
		CifradorHill encriptador = new CifradorHill(key, blocoSize);
		String cifrado = encriptador.cifrar(palavra);
		
		System.out.println("Palavra cifrada: "+cifrado);	
		System.out.println("Chave");
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				System.out.print(key[i][j] +" ");		
			}
			System.out.println("");
		}
		}else {
			System.out.println("A matriz introduzida nao e quadrada");
		}
	}
}
